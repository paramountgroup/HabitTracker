/*
 * Copyright (C) 2016 The Android Open Source Project
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
package us.theparamountgroup.android.habitTracker.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */
public final class HabitTrackerContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitTrackerContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class HabitEntry implements BaseColumns {

        /** Name of database table for habit */
        public final static String TABLE_NAME = "habits";

        /**
         * Unique ID number for the pet (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_NAME ="habit_name";

        /**
         * Breed of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_TIME = "time";

        /**
         * Gender of the pet.
         *
         * The only possible values are {@link #TYPE_UNKNOWN}, {@link #TYPE_WORK},
         * or {@link #TYPE_PLEASURE}.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_TYPE = "type";

        /**
         * Weight of the pet.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        public static final int TYPE_PLEASURE = 2;
    }

}

