package com.ezpiano.moduleapi.repository.Sheets;

import com.ezpiano.Ezpiano.entity.Sheet;

import java.util.List;

public interface SheetRepository {
    void save(Sheet sheet);
    List<Sheet> sheetList();
    Sheet sheetDetail(String userId, long sheetId);
    Sheet sheetUpdate(long sheetId, Sheet updatedSheet);

}
