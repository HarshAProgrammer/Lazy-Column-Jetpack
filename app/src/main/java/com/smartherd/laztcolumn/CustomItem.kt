package com.smartherd.laztcolumn

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartherd.laztcolumn.model.Person

@Composable
fun CustomItem(person: Person) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.LightGray).padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)

    ) {
        Text(text = "${person.age}",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        Text(text = "${person.firstName}",
            color = Color.Black,
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal)
    }

}