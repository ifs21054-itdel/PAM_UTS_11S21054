package com.ifs21054.dinopedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var rvListMain: RecyclerView? = null
    private var arrayList: ArrayList<String>? = null
    private var mainAdapter: MainAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvListMain = findViewById(R.id.rvListMain)
        arrayList = ArrayList()
        val dinosaurFamilies = listOf(
            "Tyrannosauridae",
            "Sauropoda",
            "Hadrosauridae",
            "Ceratopsidae",
            "Ornithomimidae",
            "Therizinosauridae",
            "Ankylosauridae",
            "Velociraptoridae"
        )

        for (i in 0 until dinosaurFamilies.size) {
            if (i < 8) {
                arrayList!!.add(dinosaurFamilies[i])
            } else {
                break
            }
        }

        mainAdapter = MainAdapter(this, arrayList)

        rvListMain?.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mainAdapter
        }
    }
}
