package dk.cphbusiness.template

import android.app.Activity
import android.os.Bundle
import dk.cphbusiness.template.model.Person
import dk.cphbusiness.template.model.data
import kotlinx.android.synthetic.main.activity_person.*
import org.jetbrains.anko.onClick
import org.jetbrains.anko.toast

class PersonActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)
        val position = intent.getIntExtra("position", -1)
        okButton.onClick {
            if (position < 0) data.people.add(
                    Person(
                            editFirstName.text.toString(),
                            editLastName.text.toString(),
                            editEmail.text.toString()
                    ))
            else {
                val person = data.people[position]
                person.firstName = editFirstName.text.toString()
                person.lastName = editLastName.text.toString()
                person.email = editEmail.text.toString()
                }
            finish()
            }

        if (position < 0) {
            toast("New person")
            }
        else {
            val person = data.people[position]
            editFirstName.setText(person.firstName)
            editLastName.setText(person.lastName)
            editEmail.setText(person.email)
            listPets.adapter = PetAdapter(this, person.pets)
            }


        }

    }
