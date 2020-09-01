/*
 * Copyright (C) 2012 Facebook, Inc.
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
package com.facebook.concurrency;

/** A thread factory that marks all threads that it creates as daemon threads. */
public class NamedDaemonThreadFactory extends NamedThreadFactory {
  public NamedDaemonThreadFactory(String baseName) {
    super(baseName);
  }

  @Override
  public Thread newThread(Runnable r) {
    final Thread thread = super.newThread(r);
    thread.setDaemon(true);
    return thread;
  }
}
