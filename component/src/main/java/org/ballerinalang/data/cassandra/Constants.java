/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinalang.data.cassandra;

/**
 * Constants for Cassandra Connector.
 *
 * @since 0.95.0
 */
public final class Constants {
    public static final String CONNECTOR_NAME = "ClientConnector";
    public static final String DATASOURCE_KEY = "datasource_key";
        public static final String QUESTION_MARK = "?";

    /**
     * Constants for SQL DataTypes.
     */
    public static final class DataTypes {
        public static final String LIST = "LIST";
        public static final String INT = "INT";
        public static final String BIGINT = "BIGINT";
        public static final String VARINT = "VARINT";
        public static final String FLOAT = "FLOAT";
        public static final String DOUBLE = "DOUBLE";
        public static final String TEXT = "TEXT";
        public static final String BOOLEAN = "BOOLEAN";
    }
}
