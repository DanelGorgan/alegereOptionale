package ro.uaic.info.optdist.internal;

import ro.uaic.info.optdist.*;

import org.xwiki.component.annotation.Component;

import java.util.Map;

@Component
public class ExcelDump implements ExcelDumpInterface {
    
    private Map<String,Map<String,String>> data;
    
    @Override
    public String get(String x,String y)
    {
        if (data.containsKey(x)) {
            Map map = data.get(x);
            
            if (map.containsKey(y)) {
                return (String) map.get(y);
            }
        }
        
        System.out.println(String.format("[ExcelDump] Could not find value for pair <%s, %s>!", x, y));
        return null;
    }
    
    public void ExcelDump(Map<String,Map<String,String>> newData)
    {
        this.data = newData;
    }
}
