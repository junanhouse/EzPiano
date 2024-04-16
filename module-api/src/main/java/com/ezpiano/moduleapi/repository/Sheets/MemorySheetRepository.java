package com.ezpiano.moduleapi.repository.Sheets;

import com.ezpiano.Ezpiano.entity.Sheet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemorySheetRepository implements SheetRepository{

    @Override
    public Sheet save(Sheet sheet) {
        return null;
    }

    @Override
    public List<Sheet> sheetList() {
        return null;
    }

    @Override
    public Sheet sheetDetail(String user_id, int sheet_id) {
        return null;
    }
}
