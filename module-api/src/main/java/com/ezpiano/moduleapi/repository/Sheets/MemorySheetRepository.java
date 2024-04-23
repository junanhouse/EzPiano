package com.ezpiano.moduleapi.repository.Sheets;

import com.ezpiano.Ezpiano.entity.Sheet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemorySheetRepository implements SheetRepository{
    private static Map<Long, Sheet> store = new ConcurrentHashMap<>();
    private static long sequnence = 0L;
    @Override
    public void save(Sheet sheet) {
        sheet.setSheetId(sequnence++);
        store.put(sheet.getSheetId(), sheet);
    }

    @Override
    public List<Sheet> sheetList() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Sheet sheetDetail(String userId, long sheetId) {
        return store.values().stream()
                .filter(sheet -> sheet.getUserId().equals(userId))
                .filter(sheet -> sheet.getSheetId()==sheetId)
                .findAny()
                .orElse(null);
    }
    public Sheet sheetUpdate(long sheetId, Sheet updatedSheet){
        Sheet data = store.computeIfPresent(sheetId, (id, existingSheet) -> {
            if (updatedSheet.getTitle() != null) existingSheet.setTitle(updatedSheet.getTitle());
            if (updatedSheet.getDescription() != null) existingSheet.setDescription(updatedSheet.getDescription());
            if (updatedSheet.getDirectoryId() != null) existingSheet.setDirectoryId(updatedSheet.getDirectoryId());
            if (updatedSheet.getLastPlayed() != null) existingSheet.setLastPlayed(updatedSheet.getLastPlayed());
            if (updatedSheet.getImgUrl() != null) existingSheet.setImgUrl(updatedSheet.getImgUrl());
            return existingSheet;
        });
        return data;
    }


}
