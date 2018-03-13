/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp;

/**
 *
 * @author A1
 */
public class ConvertTemp {

    private double temp;
    private String fromUnit;
    private String toUnit;
    
    public ConvertTemp(){
        temp = 0;
        fromUnit = null;
        toUnit = null;
    }
    
    public double getTemp(){
       net.webservicex.TemperatureUnit fromU = net.webservicex.TemperatureUnit.valueOf(fromUnit);
       net.webservicex.TemperatureUnit toU = net.webservicex.TemperatureUnit.valueOf(toUnit);    
       return convertTemp(temp,fromU,toU);
    }
      public void setTemp( double temp){
        this.temp = temp;
    }
    
    public void setFromUnit( String fromUnit){
        this.fromUnit = fromUnit;
    }
    
    public String getFromUnit(){
        return fromUnit;
    }
    
    public void setToUnit( String toUnit){
        this.toUnit = toUnit;
    }

    public String getToUnit(){
        return toUnit;
    }
    
    private static double convertTemp(double temperature, net.webservicex.TemperatureUnit fromUnit, net.webservicex.TemperatureUnit toUnit) {
        net.webservicex.ConvertTemperature service = new net.webservicex.ConvertTemperature();
        net.webservicex.ConvertTemperatureSoap port = service.getConvertTemperatureSoap();
        return port.convertTemp(temperature, fromUnit, toUnit);
    } 
    
}
