package com.example.ucp1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun TampilanHeaderBio(modifier: Modifier = Modifier) {
    Box(
        Modifier.fillMaxWidth()
            .background(Color.Blue).padding(40.dp)
    ) {
        Row {
            Box(
                contentAlignment = Alignment.BottomEnd
            ){
                Image(
                    painterResource(R.drawable.dalang),
                    contentDescription = null
                )
            }
        }
        Spacer(modifier = Modifier.padding(50.dp))

    }
    Box(
        contentAlignment = Alignment.BottomEnd
    ) {
        Icon(
            Icons.Default.Person,
            contentDescription = null,
            modifier = Modifier.size(25.dp),
            tint = Color.White
        )

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Tok Dalang",
                color = Color.White,
                fontSize = 25.sp
            )
            Spacer(modifier = Modifier.padding(3.dp))


            Column(modifier = Modifier.padding(16.dp)) {

            }

            Icon(
                Icons.Default.LocationOn,
                contentDescription = null,
                modifier = Modifier.size((25.dp)),
                tint = Color.White
            )

            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Bekasi",
                    color = Color.White,
                    fontSize = 25.sp
                )
            }

        }
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Plan Your Adventures",
            color = Color.Black,
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.padding(1.dp))
         Text(
             text = "Let's plam a exquisite adventure",
             color = Color.Gray,
             fontSize = 15.sp
         )
    }
}


