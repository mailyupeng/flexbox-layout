/*
 * Copyright 2016 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.apps.flexbox.validators;

import android.text.TextUtils;

/**
 * Validator for non negative integers.
 */
public class NonNegativeDecimalInputValidator implements InputValidator {

    @Override
    public boolean isValidInput(CharSequence charSequence) {
        try {
            return !TextUtils.isEmpty(charSequence) && Float.valueOf(charSequence.toString()) >= 0;
        } catch (NumberFormatException | NullPointerException ignore) {
            return false;
        }
    }
}
