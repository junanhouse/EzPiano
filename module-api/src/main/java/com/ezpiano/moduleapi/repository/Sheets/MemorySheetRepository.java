package com.ezpiano.moduleapi.repository.Sheets;

import com.ezpiano.Ezpiano.entity.Sheets;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemorySheetRepository implements SheetRepository{

    @Override
    public Sheets save(Sheets sheet) {
        return null;
    }

    @Override
    public List<Sheets> sheetList() {
        return null;
    }

    @Override
    public Sheets sheetDetail(String user_id, int sheet_id) {
        return null;
    }
}
