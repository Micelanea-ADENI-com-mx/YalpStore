package com.github.yeriomin.yalpstore;

import com.github.yeriomin.playstoreapi.DocV2;
import com.github.yeriomin.playstoreapi.ListResponse;

import java.util.ArrayList;
import java.util.List;

public class CategoryAppsIterator extends AppListIterator {

    public CategoryAppsIterator(com.github.yeriomin.playstoreapi.CategoryAppsIterator iterator) {
        super(iterator);
    }

    @Override
    protected List<DocV2> getDocList() {
        ListResponse response = ((com.github.yeriomin.playstoreapi.CategoryAppsIterator) iterator).next();
        if (response.getDocCount() == 0) {
            return new ArrayList<>();
        }
        return response.getDoc(0).getChildList();
    }
}
