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
package org.toxos.processassertions.api.internal;

/**
 * Assertions for process instances.
 * 
 * @author Tiese Barrell
 * 
 */
public interface ProcessInstanceAssertable {

    /**
     * Asserts the process is active.
     * 
     * @param processInstanceId
     *            the process instance's id to check for
     */
    void processIsActive(final String processInstanceId);

    /**
     * Asserts the process is ended.
     * 
     * @param processInstanceId
     *            the process instance's id to check for
     */
    void processIsEnded(final String processInstanceId);

    /**
     * Asserts the process has at least one execution in the activity.
     * 
     * @param processInstanceId
     *            the process instance's id to check for
     * @param activityId
     *            the activity's id to check for
     */
    void processIsInActivity(final String processInstanceId, final String activityId);

}
