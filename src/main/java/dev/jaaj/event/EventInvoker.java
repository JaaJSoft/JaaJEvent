/*
 * Copyright 2020 JaaJSoft
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

package dev.jaaj.event;

import java.util.ArrayList;
import java.util.List;

public class EventInvoker<E extends JaaJEvent<?>> {
    private final List<JaaJEventListener<E>> eventListenerList = new ArrayList<>();

    public void addListener(JaaJEventListener<E> eventHandler) {
        eventListenerList.add(eventHandler);
    }

    public boolean removeListener(JaaJEventListener<E> eventHandler) {
        return eventListenerList.remove(eventHandler);
    }

    public void invoke(E event) {
        eventListenerList.forEach(eEventHandler -> eEventHandler.handle(event));
    }

    public int getNumberOfListeners() {
        return eventListenerList.size();
    }

    public boolean hasListener() {
        return getNumberOfListeners() != 0;
    }
}
