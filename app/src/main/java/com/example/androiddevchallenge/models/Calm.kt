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
package com.example.androiddevchallenge.models

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import com.example.androiddevchallenge.R

@Immutable
data class Calm(
    val titleId: Int,
    @DrawableRes
    val imageId: Int
)

var favoriteItems = listOf(
    Calm(R.string.title_calm_short_mantras, R.drawable.image_short_mantras),
    Calm(R.string.title_calm_stress_and_anxiety, R.drawable.image_stress_and_anxiety),
    Calm(R.string.title_calm_overwhelmed, R.drawable.image_overwhelmed),
    Calm(R.string.title_calm_nature_meditations, R.drawable.image_nature_meditations),
    Calm(R.string.title_calm_self_massage, R.drawable.image_self_massage),
    Calm(R.string.title_calm_nightly_wind_down, R.drawable.image_nightly_wind_down),
)

var alignBodyItems = listOf(
    Calm(R.string.title_calm_inversions, R.drawable.image_inversions),
    Calm(R.string.title_calm_quick_yoga, R.drawable.image_quick_yoga),
    Calm(R.string.title_calm_stretching, R.drawable.image_stretching),
    Calm(R.string.title_calm_tabata, R.drawable.image_tabata),
    Calm(R.string.title_calm_hiit, R.drawable.image_hiit),
    Calm(R.string.title_calm_pre_natal, R.drawable.image_pre_natal_yoga),
)

var alignMindItems = listOf(
    Calm(R.string.title_calm_meditate, R.drawable.image_meditate),
    Calm(R.string.title_calm_with_kids, R.drawable.image_with_kids),
    Calm(R.string.title_calm_aromatherapy, R.drawable.image_aromatherapy),
    Calm(R.string.title_calm_on_the_go, R.drawable.image_on_the_go),
    Calm(R.string.title_calm_with_pets, R.drawable.image_with_pets),
    Calm(R.string.title_calm_high_stress, R.drawable.image_high_stress)
)
