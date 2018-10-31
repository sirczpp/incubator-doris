// Copyright (c) 2017, Baidu.com, Inc. All Rights Reserved

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.persist;

import java.io.IOException;
import java.io.InputStream;

/**
 * A generic abstract class to support reading edits log data from persistent
 * storage.
 * 
 * It should stream bytes from the storage exactly as they were written into the
 * #{@link EditLogOutputStream}.
 */
public abstract class EditLogInputStream extends InputStream {
    abstract String getName();

    public abstract int available() throws IOException;

    public abstract int read() throws IOException;

    public abstract int read(byte[] buffer, int offset, int len) throws IOException;

    public abstract void close() throws IOException;

    abstract long length() throws IOException;
    
}