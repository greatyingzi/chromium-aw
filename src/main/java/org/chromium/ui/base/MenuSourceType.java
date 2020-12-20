
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../ui/base/ui_base_types.h

package org.chromium.ui.base;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    MenuSourceType.MENU_SOURCE_NONE, MenuSourceType.MENU_SOURCE_MOUSE,
    MenuSourceType.MENU_SOURCE_KEYBOARD, MenuSourceType.MENU_SOURCE_TOUCH,
    MenuSourceType.MENU_SOURCE_TOUCH_EDIT_MENU, MenuSourceType.MENU_SOURCE_LONG_PRESS,
    MenuSourceType.MENU_SOURCE_LONG_TAP, MenuSourceType.MENU_SOURCE_TOUCH_HANDLE,
    MenuSourceType.MENU_SOURCE_STYLUS, MenuSourceType.MENU_SOURCE_ADJUST_SELECTION,
    MenuSourceType.MENU_SOURCE_ADJUST_SELECTION_RESET, MenuSourceType.MENU_SOURCE_TYPE_LAST
})
@Retention(RetentionPolicy.SOURCE)
public @interface MenuSourceType {
  int MENU_SOURCE_NONE = 0;
  int MENU_SOURCE_MOUSE = 1;
  int MENU_SOURCE_KEYBOARD = 2;
  int MENU_SOURCE_TOUCH = 3;
  int MENU_SOURCE_TOUCH_EDIT_MENU = 4;
  int MENU_SOURCE_LONG_PRESS = 5;
  int MENU_SOURCE_LONG_TAP = 6;
  int MENU_SOURCE_TOUCH_HANDLE = 7;
  int MENU_SOURCE_STYLUS = 8;
  int MENU_SOURCE_ADJUST_SELECTION = 9;
  int MENU_SOURCE_ADJUST_SELECTION_RESET = 10;
  int MENU_SOURCE_TYPE_LAST = MENU_SOURCE_ADJUST_SELECTION_RESET;
}
