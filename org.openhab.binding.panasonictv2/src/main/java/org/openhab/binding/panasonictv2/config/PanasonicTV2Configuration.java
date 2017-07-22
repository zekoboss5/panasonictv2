/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.panasonictv2.config;

/**
 * Configuration class for {@link SamsungTvBinding} device.
 *
 * @author Charky - Initial contribution
 */
public class PanasonicTV2Configuration {
    public static final String HOST_NAME = "hostName";
    public static final String REFRESH_INTERVAL = "refreshInterval";

    public String hostName;
    public int refreshInterval;

}
