/*******************************************************************************
 * Copyright 2013 Tiese Barrell
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
package org.anemonos.activiti.assertion.suite;

import org.anemonos.activiti.assertion.LogMessageTest;
import org.anemonos.activiti.assertion.ProcessIsActiveAssertionsTest;
import org.anemonos.activiti.assertion.ProcessIsEndedAndInExclusiveEndEventAssertionsTest;
import org.anemonos.activiti.assertion.ProcessIsEndedAssertionsTest;
import org.anemonos.activiti.assertion.TaskIsUncompletedByProcessInstanceAndTaskDefinitionKeyAssertionsTest;
import org.anemonos.activiti.assertion.TaskIsUncompletedByTaskAssertionsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for the org.anemonos.activiti.assertion package.
 */
@RunWith(Suite.class)
@SuiteClasses({ ProcessIsActiveAssertionsTest.class, ProcessIsEndedAssertionsTest.class, TaskIsUncompletedByTaskAssertionsTest.class,
		TaskIsUncompletedByProcessInstanceAndTaskDefinitionKeyAssertionsTest.class, ProcessIsEndedAndInExclusiveEndEventAssertionsTest.class,
		LogMessageTest.class })
public class AssertionTests {

}