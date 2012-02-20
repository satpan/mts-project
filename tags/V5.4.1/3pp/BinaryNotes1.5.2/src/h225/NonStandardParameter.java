
package h225;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1Sequence ( name = "NonStandardParameter", isSet = false )
    public class NonStandardParameter implements IASN1PreparedElement {
            
        @ASN1Element ( name = "nonStandardIdentifier", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonStandardIdentifier nonStandardIdentifier = null;
                
  @ASN1OctetString( name = "" )
    
        @ASN1Element ( name = "data", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] data = null;
                
  
        
        public NonStandardIdentifier getNonStandardIdentifier () {
            return this.nonStandardIdentifier;
        }

        

        public void setNonStandardIdentifier (NonStandardIdentifier value) {
            this.nonStandardIdentifier = value;
        }
        
  
        
        public byte[] getData () {
            return this.data;
        }

        

        public void setData (byte[] value) {
            this.data = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(NonStandardParameter.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            