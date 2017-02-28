package dk.cphbusiness.template

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import dk.cphbusiness.template.model.Person
import dk.cphbusiness.template.model.data
import org.jetbrains.anko.toast

class PeopleActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people)
        listAdapter = ArrayAdapter<Person>(
                this,
                android.R.layout.simple_list_item_1,
                data.people
                )
        }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        // super.onListItemClick(l, v, position, id)
        // toast(data.people[position].firstName)
        val intent = Intent(this, PersonActivity::class.java)
        intent.putExtra("position", position)
        startActivity(intent)
        }

    }
