package com.ezpiano.moduleapi.repository.Sheets;

import com.ezpiano.Ezpiano.entity.Sheet;

import java.util.List;

public interface SheetRepository {
    Sheet save(Sheet sheet);
    List<Sheet> sheetList();
    Sheet sheetDetail(String user_id, int sheet_id);
}
