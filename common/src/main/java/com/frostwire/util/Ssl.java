/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011-2017, FrostWire(R). All rights reserved.
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

package com.frostwire.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * Util class to provide SSL/TLS specific features.
 *
 * @author gubatron
 * @author aldenml
 */
public final class Ssl {

    private static final HostnameVerifier NULL_HOSTNAME_VERIFIER = new NullHostnameVerifier();

    private Ssl() {
    }

    /**
     * Returns a hostname verifier instance that simply accepts all hostnames as valid.
     *
     * @return the hostname verifier.
     */
    public static HostnameVerifier nullHostnameVerifier() {
        return NULL_HOSTNAME_VERIFIER;
    }

    private static final class NullHostnameVerifier implements HostnameVerifier {

        @Override
        public boolean verify(String s, SSLSession sslSession) {
            return true;
        }
    }
}
