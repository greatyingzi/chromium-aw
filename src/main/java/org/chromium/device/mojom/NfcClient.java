// NfcClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/nfc.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public interface NfcClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NfcClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NfcClient, NfcClient.Proxy> MANAGER = NfcClient_Internal.MANAGER;


    void onWatch(
int[] watchIds, String serialNumber, NdefMessage message);



    void onError(
NdefError error);


}
