package dk.cphbusiness.template

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import dk.cphbusiness.template.model.Pet
import kotlinx.android.synthetic.main.item_pet.view.*

class PetAdapter(context: Context, val pets: List<Pet>) :
        ArrayAdapter<Pet>(context, 0, pets) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val pet = pets[position]
//        val template =
//                if (convertView == null)
//                    LayoutInflater.from(context).inflate(R.layout.item_pet, parent, false)
//                else convertView

        val template =
                convertView ?: LayoutInflater.from(context).inflate(R.layout.item_pet, parent, false)
        template.nameText.text = pet.name
        template.ageText.text = pet.age.toString()
        return template
        }

    }