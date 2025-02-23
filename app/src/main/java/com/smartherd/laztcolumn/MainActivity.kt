package com.smartherd.laztcolumn

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.smartherd.laztcolumn.repository.PersonRepository
import com.smartherd.laztcolumn.ui.theme.LaztColumnTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            val personRepository = PersonRepository()
//            val getAllData = personRepository.getAllData()
            val sections = listOf("A", "B", "C", "D", "E", "F", "G", "H")

            LazyColumn(
                contentPadding = PaddingValues(all = 12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
//                itemsIndexed(items = getAllData,
//                    key = {
//                        index, item ->
//                        item.id
//                    }) { index,item ->
//                    Log.d("Harsh",index.toString())
//                    CustomItem(person = item)
//                }
                sections.forEach { section ->
                    stickyHeader {
                        Text(
                            text = "Section $section",
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.LightGray)
                                .padding(12.dp)
                        )
                    }
                    items(10) {
                        Text(
                            text = "Item $it of section $section",
                            modifier = Modifier.padding(12.dp)
                        )
                    }
                }

            }
        }
    }
}

