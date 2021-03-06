/**
 * Copyright 2016 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * </p>
 */

package com.vip.saturn.job.exception;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 分布式作业抛出的异常基类
 */
public class JobException extends RuntimeException {

	private static final long serialVersionUID = -5323792555332165319L;

	/**
	 * @param errorMessage if the args array are not empty then should be the format of error message; otherwise, it is the error message.
	 * @param args Arguments referenced by the format specifiers in the format string
	 */
	public JobException(final String errorMessage, final Object... args) {
		super(ArrayUtils.isEmpty(args) ? errorMessage : String.format(errorMessage, args));
	}

	public JobException(final Exception cause) {
		super(cause);
	}

	public JobException(Throwable cause) {
		super(cause);
	}
}
