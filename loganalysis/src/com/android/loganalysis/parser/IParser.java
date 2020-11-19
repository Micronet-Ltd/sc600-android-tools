/*
 * Copyright (C) 2011 The Android Open Source Project
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
package com.android.loganalysis.parser;

import com.android.loganalysis.item.IItem;

import java.util.List;

/**
 * An interface which defines the behavior for a parser.  The parser will receive a block of data
 * that it can consider complete.  It parses the input and returns a single {@link IItem} instance.
 * Furthermore, the parser should be robust against invalid input -- the input format may drift over
 * time.
 */
public interface IParser {

    /**
     * Parses a list of {@link String} objects and returns a {@link IItem}.
     *
     * @param lines A list of {@link String} objects.
     * @return The parsed {@link IItem} object.
     */
    public IItem parse(List<String> lines);
}

