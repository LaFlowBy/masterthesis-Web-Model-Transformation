package org.eclipse.glsp.example.javaemf.palette;

import java.util.List;
import java.util.Map;

import org.eclipse.glsp.example.javaemf.TypeGraphModelTypes;
import org.eclipse.glsp.server.actions.TriggerNodeCreationAction;
import org.eclipse.glsp.server.features.toolpalette.PaletteItem;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;

import com.google.common.collect.Lists;

public class TypeGraphToolPaletteItemProvider implements ToolPaletteItemProvider {
    @Override
    public List<PaletteItem> getItems(Map<String, String> args) {
        return Lists.newArrayList(nodes());
    }

    private PaletteItem nodes() {
        PaletteItem createTask = node(TypeGraphModelTypes.TYPE_NODE, "TypeNode");
        List<PaletteItem> nodes = Lists.newArrayList(createTask);
        return PaletteItem.createPaletteGroup("nodes", "Nodes", nodes, "symbol-property");
    }

    private PaletteItem node(String elementTypeId, String label) {
        return new PaletteItem(elementTypeId, label, new TriggerNodeCreationAction(elementTypeId));
    }
}
