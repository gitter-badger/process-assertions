/*******************************************************************************
 * Copyright 2014 Tiese Barrell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.toxos.processassertions.integration.common.process;

/**
 * Constants for the single user task process.
 * 
 * @author Tiese Barrell
 */
public enum SingleUserTaskProcessConstant {

    /**
     * The process' key.
     */
    PROCESS_KEY("testProcessSingleUserTask"),

    /**
     * The id of the end event.
     */
    END_EVENT_ID("endCompleted"),

    /**
     * The id of the user task.
     */
    USER_TASK_ACTIVITY_ID("singleUserTask");

    private final String value;

    private SingleUserTaskProcessConstant(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
