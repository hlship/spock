/*
 * Copyright 2009, 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spockframework.tapestry;

/**
 * Holds on to service instances with "perIteration" scope until
 * they are released by <tt>TapestryInterceptor</tt>.
 *
 */
public interface IPerIterationManager {

    /**
     * Creates a value is stored in the per-iteration map.  The value is initially non-existent.
     */
    <T> PerIterationValue<T> createValue();

    /**
     * Discards all stored values. The {@link PerIterationValue} is still valid, but the underlying stored
     * value will no longer exist.
     */
    void cleanup();
}
