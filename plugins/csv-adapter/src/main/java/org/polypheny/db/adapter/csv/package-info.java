
/*
 * Copyright 2019-2023 The Polypheny Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Polypheny-DB query provider that reads from CSV (comma-separated value) files.
 *
 * A Polypheny-DB schema maps onto a directory, and each CSV file in that directory appears as a table. Full SQL operations are available on those tables.
 */

package org.polypheny.db.adapter.csv;



