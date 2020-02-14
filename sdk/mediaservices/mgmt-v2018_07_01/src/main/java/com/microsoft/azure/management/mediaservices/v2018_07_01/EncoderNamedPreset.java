/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EncoderNamedPreset.
 */
public final class EncoderNamedPreset extends ExpandableStringEnum<EncoderNamedPreset> {
    /** Static value H264SingleBitrateSD for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264SINGLE_BITRATE_SD = fromString("H264SingleBitrateSD");

    /** Static value H264SingleBitrate720p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264SINGLE_BITRATE720P = fromString("H264SingleBitrate720p");

    /** Static value H264SingleBitrate1080p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264SINGLE_BITRATE1080P = fromString("H264SingleBitrate1080p");

    /** Static value AdaptiveStreaming for EncoderNamedPreset. */
    public static final EncoderNamedPreset ADAPTIVE_STREAMING = fromString("AdaptiveStreaming");

    /** Static value AACGoodQualityAudio for EncoderNamedPreset. */
    public static final EncoderNamedPreset AACGOOD_QUALITY_AUDIO = fromString("AACGoodQualityAudio");

    /** Static value ContentAwareEncodingExperimental for EncoderNamedPreset. */
    public static final EncoderNamedPreset CONTENT_AWARE_ENCODING_EXPERIMENTAL = fromString("ContentAwareEncodingExperimental");

    /** Static value ContentAwareEncoding for EncoderNamedPreset. */
    public static final EncoderNamedPreset CONTENT_AWARE_ENCODING = fromString("ContentAwareEncoding");

    /** Static value H264MultipleBitrate1080p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264MULTIPLE_BITRATE1080P = fromString("H264MultipleBitrate1080p");

    /** Static value H264MultipleBitrate720p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264MULTIPLE_BITRATE720P = fromString("H264MultipleBitrate720p");

    /** Static value H264MultipleBitrateSD for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264MULTIPLE_BITRATE_SD = fromString("H264MultipleBitrateSD");

    /**
     * Creates or finds a EncoderNamedPreset from its string representation.
     * @param name a name to look for
     * @return the corresponding EncoderNamedPreset
     */
    @JsonCreator
    public static EncoderNamedPreset fromString(String name) {
        return fromString(name, EncoderNamedPreset.class);
    }

    /**
     * @return known EncoderNamedPreset values
     */
    public static Collection<EncoderNamedPreset> values() {
        return values(EncoderNamedPreset.class);
    }
}