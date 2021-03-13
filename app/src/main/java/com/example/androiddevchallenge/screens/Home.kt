/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.components.BottomBar
import com.example.androiddevchallenge.components.CardRow
import com.example.androiddevchallenge.components.ImageRow
import com.example.androiddevchallenge.components.SearchField
import com.example.androiddevchallenge.models.alignBodyItems
import com.example.androiddevchallenge.models.alignMindItems
import com.example.androiddevchallenge.models.favoriteItems
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Home(navController: NavController = rememberNavController()) {
    var headerFavorites = stringResource(id = R.string.title_header_favorites)
    var headerBodyAlign = stringResource(id = R.string.title_header_align_body)
    var headerMindAlign = stringResource(id = R.string.title_header_align_mind)
    Surface(color = MaterialTheme.colors.background) {
        Box {
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.size(56.dp))
                SearchField()
                CardRow(headerFavorites, favoriteItems)
                Spacer(Modifier.size(16.dp))
                ImageRow(headerBodyAlign, alignBodyItems)
                Spacer(Modifier.size(8.dp))
                ImageRow(headerMindAlign, alignMindItems)
            }
            Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxSize()) {
                BottomBar()
            }
        }
    }
}

@Preview("Home Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeLightPreview() {
    MyTheme {
        Home()
    }
}

@Preview("Home Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeDarkPreview() {
    MyTheme(darkTheme = true) {
        Home()
    }
}
