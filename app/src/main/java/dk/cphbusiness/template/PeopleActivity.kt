package dk.cphbusiness.template

import android.app.ListActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import dk.cphbusiness.template.model.Person
import dk.cphbusiness.template.model.data

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



    }
