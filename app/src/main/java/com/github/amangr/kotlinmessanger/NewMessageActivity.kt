package com.github.amangr.kotlinmessanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_new_message.*

class NewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_message)

        supportActionBar?.title = "Select User"
// assigning adapter
        val adapter = GroupAdapter<GroupieViewHolder>()
        recyclerView_newmessage.adapter = adapter
    }
}

//class CustomAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>{
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        TODO("Not yet implemented")
//    }
//}