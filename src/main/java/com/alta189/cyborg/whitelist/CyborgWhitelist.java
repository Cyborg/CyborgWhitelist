/*
 * Copyright (C) 2012 CyborgDev <cyborg@alta189.com>
 *
 * This file is part of CyborgWhitelist
 *
 * CyborgWhitelist is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CyborgWhitelist is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.alta189.cyborg.whitelist;

import com.alta189.cyborg.api.plugin.CommonPlugin;

import java.util.logging.Level;

public class CyborgWhitelist extends CommonPlugin {

	@Override
	public void onEnable() {
		getLogger().log(Level.INFO, "Enabling...");
		getCyborg().getEventManager().registerEvents(new EventListener(), this);
		getLogger().log(Level.INFO, "Successfully enabled!");
	}

	@Override
	public void onDisable() {
		getLogger().log(Level.INFO, "Disabling...");

		getLogger().log(Level.INFO, "Successfully disabled!");
	}

}
