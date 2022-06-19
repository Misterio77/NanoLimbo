/*
 * Copyright (C) 2020 Nan1t
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

import org.junit.jupiter.api.Test;
import ru.nanit.limbo.world.schematic.Schematic;
import ru.nanit.limbo.world.schematic.SchematicLoader;

import java.io.IOException;
import java.io.InputStream;

public class SchematicLoadTest {

    @Test
    public void loadLegacy() throws IOException {
        SchematicLoader loader = new SchematicLoader();
        InputStream is = getClass().getResourceAsStream("test.schematic");
        Schematic schematic = loader.load(is);

        System.out.println(schematic);
    }

    @Test
    public void loadModern() throws IOException {
        SchematicLoader loader = new SchematicLoader();
        InputStream is = getClass().getResourceAsStream("spawn.schem");
        Schematic schematic = loader.load(is);

        System.out.println(schematic);
    }

}
