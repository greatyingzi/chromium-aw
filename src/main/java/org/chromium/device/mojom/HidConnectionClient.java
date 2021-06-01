// HidConnectionClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/hid.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public interface HidConnectionClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends HidConnectionClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<HidConnectionClient, HidConnectionClient.Proxy> MANAGER = HidConnectionClient_Internal.MANAGER;


    void onInputReport(
byte reportId, byte[] buffer);


}
