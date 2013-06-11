
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
    @ASN1Choice ( name = "GatekeeperRejectReason" )
    public class GatekeeperRejectReason implements IASN1PreparedElement {
            
        @ASN1Null ( name = "resourceUnavailable" ) 
    
        @ASN1Element ( name = "resourceUnavailable", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject resourceUnavailable = null;
                
  
        @ASN1Null ( name = "terminalExcluded" ) 
    
        @ASN1Element ( name = "terminalExcluded", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject terminalExcluded = null;
                
  
        @ASN1Null ( name = "invalidRevision" ) 
    
        @ASN1Element ( name = "invalidRevision", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject invalidRevision = null;
                
  
        @ASN1Null ( name = "undefinedReason" ) 
    
        @ASN1Element ( name = "undefinedReason", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject undefinedReason = null;
                
  
        
        public org.bn.types.NullObject getResourceUnavailable () {
            return this.resourceUnavailable;
        }

        public boolean isResourceUnavailableSelected () {
            return this.resourceUnavailable != null;
        }

        private void setResourceUnavailable (org.bn.types.NullObject value) {
            this.resourceUnavailable = value;
        }

        
        public void selectResourceUnavailable () {
            selectResourceUnavailable (new org.bn.types.NullObject());
	}
	
        public void selectResourceUnavailable (org.bn.types.NullObject value) {
            this.resourceUnavailable = value;
            
                    setTerminalExcluded(null);
                
                    setInvalidRevision(null);
                
                    setUndefinedReason(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getTerminalExcluded () {
            return this.terminalExcluded;
        }

        public boolean isTerminalExcludedSelected () {
            return this.terminalExcluded != null;
        }

        private void setTerminalExcluded (org.bn.types.NullObject value) {
            this.terminalExcluded = value;
        }

        
        public void selectTerminalExcluded () {
            selectTerminalExcluded (new org.bn.types.NullObject());
	}
	
        public void selectTerminalExcluded (org.bn.types.NullObject value) {
            this.terminalExcluded = value;
            
                    setResourceUnavailable(null);
                
                    setInvalidRevision(null);
                
                    setUndefinedReason(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getInvalidRevision () {
            return this.invalidRevision;
        }

        public boolean isInvalidRevisionSelected () {
            return this.invalidRevision != null;
        }

        private void setInvalidRevision (org.bn.types.NullObject value) {
            this.invalidRevision = value;
        }

        
        public void selectInvalidRevision () {
            selectInvalidRevision (new org.bn.types.NullObject());
	}
	
        public void selectInvalidRevision (org.bn.types.NullObject value) {
            this.invalidRevision = value;
            
                    setResourceUnavailable(null);
                
                    setTerminalExcluded(null);
                
                    setUndefinedReason(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getUndefinedReason () {
            return this.undefinedReason;
        }

        public boolean isUndefinedReasonSelected () {
            return this.undefinedReason != null;
        }

        private void setUndefinedReason (org.bn.types.NullObject value) {
            this.undefinedReason = value;
        }

        
        public void selectUndefinedReason () {
            selectUndefinedReason (new org.bn.types.NullObject());
	}
	
        public void selectUndefinedReason (org.bn.types.NullObject value) {
            this.undefinedReason = value;
            
                    setResourceUnavailable(null);
                
                    setTerminalExcluded(null);
                
                    setInvalidRevision(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(GatekeeperRejectReason.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            