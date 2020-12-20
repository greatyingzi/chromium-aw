
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../ui/base/page_transition_types.h

package org.chromium.ui.base;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PageTransition.FIRST, PageTransition.LINK, PageTransition.TYPED, PageTransition.AUTO_BOOKMARK,
    PageTransition.AUTO_SUBFRAME, PageTransition.MANUAL_SUBFRAME, PageTransition.GENERATED,
    PageTransition.AUTO_TOPLEVEL, PageTransition.FORM_SUBMIT, PageTransition.RELOAD,
    PageTransition.KEYWORD, PageTransition.KEYWORD_GENERATED, PageTransition.LAST_CORE,
    PageTransition.CORE_MASK, PageTransition.BLOCKED, PageTransition.FORWARD_BACK,
    PageTransition.FROM_ADDRESS_BAR, PageTransition.HOME_PAGE, PageTransition.FROM_API,
    PageTransition.CHAIN_START, PageTransition.CHAIN_END, PageTransition.CLIENT_REDIRECT,
    PageTransition.SERVER_REDIRECT, PageTransition.IS_REDIRECT_MASK, PageTransition.QUALIFIER_MASK
})
@Retention(RetentionPolicy.SOURCE)
public @interface PageTransition {
  int FIRST = 0;
  /**
   * User got to this page by clicking a link on another page.
   */
  int LINK = FIRST;
  /**
   * User got this page by typing the URL in the URL bar.  This should not be used for cases where
   * the user selected a choice that didn't look at all like a URL; see GENERATED below. We also use
   * this for other "explicit" navigation actions.
   */
  int TYPED = 1;
  /**
   * User got to this page through a suggestion in the UI, for example) through the destinations
   * page.
   */
  int AUTO_BOOKMARK = 2;
  /**
   * This is a subframe navigation. This is any content that is automatically loaded in a non-
   * toplevel frame. For example, if a page consists of several frames containing ads, those ad URLs
   * will have this transition type. The user may not even realize the content in these pages is a
   * separate frame, so may not care about the URL (see MANUAL below).
   */
  int AUTO_SUBFRAME = 3;
  /**
   * For subframe navigations that are explicitly requested by the user and generate new navigation
   * entries in the back/forward list. These are probably more important than frames that were
   * automatically loaded in the background because the user probably cares about the fact that this
   * link was loaded.
   */
  int MANUAL_SUBFRAME = 4;
  /**
   * User got to this page by typing in the URL bar and selecting an entry that did not look like a
   * URL.  For example, a match might have the URL of a Google search result page, but appear like
   * "Search Google for ...". These are not quite the same as TYPED navigations because the user
   * didn't type or see the destination URL. See also KEYWORD.
   */
  int GENERATED = 5;
  /**
   * This is a toplevel navigation. This is any content that is automatically loaded in a toplevel
   * frame.  For example, opening a tab to show the ASH screen saver, opening the devtools window,
   * opening the NTP after the safe browsing warning, opening web-based dialog boxes are examples of
   * AUTO_TOPLEVEL navigations.
   */
  int AUTO_TOPLEVEL = 6;
  /**
   * The user filled out values in a form and submitted it. NOTE that in some situations submitting
   * a form does not result in this transition type. This can happen if the form uses script to
   * submit the contents.
   */
  int FORM_SUBMIT = 7;
  /**
   * The user "reloaded" the page, either by hitting the reload button or by hitting enter in the
   * address bar.  NOTE: This is distinct from the concept of whether a particular load uses "reload
   * semantics" (i.e. bypasses cached data).  For this reason, lots of code needs to pass around the
   * concept of whether a load should be treated as a "reload" separately from their tracking of
   * this transition type, which is mainly used for proper scoring for consumers who care about how
   * frequently a user typed/visited a particular URL. SessionRestore and undo tab close use this
   * transition type too.
   */
  int RELOAD = 8;
  /**
   * The url was generated from a replaceable keyword other than the default search provider. If the
   * user types a keyword (which also applies to tab-to-search) in the omnibox this qualifier is
   * applied to the transition type of the generated url. TemplateURLModel then may generate an
   * additional visit with a transition type of KEYWORD_GENERATED against the url 'http://' +
   * keyword. For example, if you do a tab-to-search against wikipedia the generated url has a
   * transition qualifer of KEYWORD, and TemplateURLModel generates a visit for 'wikipedia.org' with
   * a transition type of KEYWORD_GENERATED.
   */
  int KEYWORD = 9;
  /**
   * Corresponds to a visit generated for a keyword. See description of KEYWORD for more details.
   */
  int KEYWORD_GENERATED = 10;
  /**
   * ADDING NEW CORE VALUE? Be sure to update the LAST_CORE and CORE_MASK values below.  Also update
   * CoreTransitionString().
   */
  int LAST_CORE = KEYWORD_GENERATED;
  int CORE_MASK = 0xFF;
  /**
   * Qualifiers Any of the core values above can be augmented by one or more qualifiers. These
   * qualifiers further define the transition. A managed user attempted to visit a URL but was
   * blocked.
   */
  int BLOCKED = 0x00800000;
  /**
   * User used the Forward or Back button to navigate among browsing history.
   */
  int FORWARD_BACK = 0x01000000;
  /**
   * User used the address bar to trigger this navigation.
   */
  int FROM_ADDRESS_BAR = 0x02000000;
  /**
   * User is navigating to the home page.
   */
  int HOME_PAGE = 0x04000000;
  /**
   * The transition originated from an external application; the exact definition of this is
   * embedder dependent.
   */
  int FROM_API = 0x08000000;
  /**
   * The beginning of a navigation chain.
   */
  int CHAIN_START = 0x10000000;
  /**
   * The last transition in a redirect chain.
   */
  int CHAIN_END = 0x20000000;
  /**
   * Redirects caused by JavaScript or a meta refresh tag on the page.
   */
  int CLIENT_REDIRECT = 0x40000000;
  /**
   * Redirects sent from the server by HTTP headers. It might be nice to break this out into 2 types
   * in the future, permanent or temporary, if we can get that information from WebKit.
   */
  int SERVER_REDIRECT = 0x80000000;
  /**
   * Used to test whether a transition involves a redirect.
   */
  int IS_REDIRECT_MASK = 0xC0000000;
  /**
   * General mask defining the bits used for the qualifiers.
   */
  int QUALIFIER_MASK = 0xFFFFFF00;
}
