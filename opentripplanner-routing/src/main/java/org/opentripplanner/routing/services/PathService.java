/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.routing.services;

import java.util.Date;
import java.util.List;

import org.opentripplanner.routing.core.TraverseOptions;
import org.opentripplanner.routing.spt.GraphPath;

public interface PathService {
    public List<GraphPath> plan(String fromPlace, String toPlace, Date targetTime, TraverseOptions options);

    public List<GraphPath> plan(String from, String to, List<String> intermediates, Date dateTime,
            TraverseOptions options);
}
