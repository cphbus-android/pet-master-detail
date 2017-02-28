package dk.cphbusiness.template

import android.app.ListActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SimpleAdapter
import dk.cphbusiness.template.model.Person
import dk.cphbusiness.template.model.data
import org.jetbrains.anko.intentFor

class PeopleActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people)
//        listAdapter = ArrayAdapter<Person>(
//                this,
//                android.R.layout.simple_list_item_1,
//                data.people
//                )
        }

    override fun onStart() {
        super.onStart()
//        listAdapter = SimpleAdapter(
//                this,
//                data.people.map { mapOf( "firstName" to it.firstName, "lastName" to it.lastName) },
//                android.R.layout.two_line_list_item,
//                arrayOf("firstName", "lastName"),
//                intArrayOf(android.R.id.text1, android.R.id.text2)
//                )
        listAdapter = SimpleAdapter(
                this,
                data.people.map { mapOf( "firstName" to it.firstName, "lastName" to it.lastName, "email" to it.email) },
                R.layout.item_person,
                arrayOf("firstName", "lastName", "email"),
                intArrayOf(R.id.textFirstName, R.id.textLastName, R.id.textEmail)
        )

        }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
//        val intent = Intent(this, PersonActivity::class.java)
//        intent.putExtra("position", position)
//        startActivity(intent)

        startActivity(intentFor<PersonActivity>("position" to position))
        }

    }
