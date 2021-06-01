// AndroidOverlayProvider_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/android_overlay.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


class AndroidOverlayProvider_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<AndroidOverlayProvider, AndroidOverlayProvider.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<AndroidOverlayProvider, AndroidOverlayProvider.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.AndroidOverlayProvider";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, AndroidOverlayProvider impl) {
            return new Stub(core, impl);
        }

        @Override
        public AndroidOverlayProvider[] buildArray(int size) {
          return new AndroidOverlayProvider[size];
        }
    };


    private static final int CREATE_OVERLAY_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements AndroidOverlayProvider.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void createOverlay(
org.chromium.mojo.bindings.InterfaceRequest<AndroidOverlay> overlay, AndroidOverlayClient client, AndroidOverlayConfig config) {

            AndroidOverlayProviderCreateOverlayParams _message = new AndroidOverlayProviderCreateOverlayParams();

            _message.overlay = overlay;

            _message.client = client;

            _message.config = config;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CREATE_OVERLAY_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<AndroidOverlayProvider> {

        Stub(org.chromium.mojo.system.Core core, AndroidOverlayProvider impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                AndroidOverlayProvider_Internal.MANAGER, messageWithHeader);





                    case CREATE_OVERLAY_ORDINAL: {

                        AndroidOverlayProviderCreateOverlayParams data =
                                AndroidOverlayProviderCreateOverlayParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createOverlay(data.overlay, data.client, data.config);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), AndroidOverlayProvider_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class AndroidOverlayProviderCreateOverlayParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<AndroidOverlay> overlay;
        public AndroidOverlayClient client;
        public AndroidOverlayConfig config;

        private AndroidOverlayProviderCreateOverlayParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AndroidOverlayProviderCreateOverlayParams() {
            this(0);
        }

        public static AndroidOverlayProviderCreateOverlayParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AndroidOverlayProviderCreateOverlayParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AndroidOverlayProviderCreateOverlayParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AndroidOverlayProviderCreateOverlayParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AndroidOverlayProviderCreateOverlayParams(elementsOrVersion);
                    {
                        
                    result.overlay = decoder0.readInterfaceRequest(8, false);
                    }
                    {
                        
                    result.client = decoder0.readServiceInterface(12, false, AndroidOverlayClient.MANAGER);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.config = AndroidOverlayConfig.decode(decoder1);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.overlay, 8, false);
            
            encoder0.encode(this.client, 12, false, AndroidOverlayClient.MANAGER);
            
            encoder0.encode(this.config, 24, false);
        }
    }



}
