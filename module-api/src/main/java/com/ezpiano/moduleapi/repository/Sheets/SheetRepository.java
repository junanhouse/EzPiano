package com.ezpiano.moduleapi.repository.Sheets;

import com.ezpiano.Ezpiano.entity.Sheets;

import java.util.List;

public interface SheetRepository {
    Sheets save(Sheets sheet);
    List<Sheets> sheetList();
    Sheets sheetDetail(String user_id, int sheet_id);
}
