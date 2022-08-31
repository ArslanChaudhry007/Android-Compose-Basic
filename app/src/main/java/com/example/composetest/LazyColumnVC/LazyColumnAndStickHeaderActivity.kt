package com.example.composetest.LazyColumnVC

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.LazyColumnVC.ui.theme.ComposeTestTheme

class LazyColumnAndStickHeaderActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            com.example.composetest.ui.theme.ComposeTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

//                    for recyclerview
                    /* val personeRepository = PersonRepository()
                     val getAllDate = personeRepository.getAllData()
                     LazyColumn(
                         contentPadding = PaddingValues(all = 12.dp),
                         verticalArrangement = Arrangement.spacedBy(12.dp)
                     ) {
                         itemsIndexed(items = getAllDate) { index, person ->
                             Log.d("MainActivity", index.toString())
                             CustomItem(person = person)
                         }
                     }*/

                    val sections = listOf("A", "B", "C", "D", "E", "F")
                    LazyColumn(
                        contentPadding = PaddingValues(all = 12.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        sections.forEach { section ->
                            stickyHeader {
                                Text(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(Color.LightGray)
                                        .padding(12.dp),
                                    text = "Section $section"
                                )
                            }
                            items(10) {
                                Text(
                                    modifier = Modifier.padding(12.dp),
                                    text = "Items $it from the sections $section"
                                )
                            }
                        }
                    }
                }
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview11() {
    com.example.composetest.ui.theme.ComposeTestTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            val personeRepository = PersonRepository()
            val getAllDate = personeRepository.getAllData()
            LazyColumn(contentPadding = PaddingValues(all = 12.dp)) {
                items(items = getAllDate) { person ->
                    CustomItem(person = person)
                }
            }
        }
    }
}