package com.sbz.lazycolumnjetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sbz.lazycolumnjetpackcompose.model.Person
import com.sbz.lazycolumnjetpackcompose.repository.PersonRepository

@Composable
fun CustomViewItem(
    person: Person
) {
    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${person.id}",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )

        Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = 25.sp,
            fontWeight = FontWeight.Normal
        )

        Text(
            text = person.lastName,
            color = Color.Black,
            fontSize = 25.sp,
            fontWeight = FontWeight.Normal
        )

        Text(
            text = "${person.age}",
            color = Color.Black,
            fontSize = 25.sp,
            fontWeight = FontWeight.Normal
        )
    }
}

@Preview
@Composable
fun PreviewComposable() {
    CustomViewItem(
        person = Person(
            id = 0,
            firstName = "First",
            lastName = "Last",
            age = 10
        )
    )
}