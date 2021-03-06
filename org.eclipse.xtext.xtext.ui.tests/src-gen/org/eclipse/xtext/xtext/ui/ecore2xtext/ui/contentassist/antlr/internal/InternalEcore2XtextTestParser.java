package org.eclipse.xtext.xtext.ui.ecore2xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.xtext.ui.ecore2xtext.services.Ecore2XtextTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEcore2XtextTestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'Root'", "'{'", "'}'", "'classes'", "','", "'concrete0'", "'Concrete0'", "'Concrete1'", "'DiamondInheritance'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalEcore2XtextTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEcore2XtextTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEcore2XtextTestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEcore2XtextTest.g"; }


     
     	private Ecore2XtextTestGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Ecore2XtextTestGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRoot"
    // InternalEcore2XtextTest.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalEcore2XtextTest.g:61:1: ( ruleRoot EOF )
            // InternalEcore2XtextTest.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalEcore2XtextTest.g:69:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:73:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalEcore2XtextTest.g:74:1: ( ( rule__Root__Group__0 ) )
            {
            // InternalEcore2XtextTest.g:74:1: ( ( rule__Root__Group__0 ) )
            // InternalEcore2XtextTest.g:75:1: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalEcore2XtextTest.g:76:1: ( rule__Root__Group__0 )
            // InternalEcore2XtextTest.g:76:2: rule__Root__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleAbstract"
    // InternalEcore2XtextTest.g:88:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // InternalEcore2XtextTest.g:89:1: ( ruleAbstract EOF )
            // InternalEcore2XtextTest.g:90:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // InternalEcore2XtextTest.g:97:1: ruleAbstract : ( ( rule__Abstract__Alternatives ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:101:2: ( ( ( rule__Abstract__Alternatives ) ) )
            // InternalEcore2XtextTest.g:102:1: ( ( rule__Abstract__Alternatives ) )
            {
            // InternalEcore2XtextTest.g:102:1: ( ( rule__Abstract__Alternatives ) )
            // InternalEcore2XtextTest.g:103:1: ( rule__Abstract__Alternatives )
            {
             before(grammarAccess.getAbstractAccess().getAlternatives()); 
            // InternalEcore2XtextTest.g:104:1: ( rule__Abstract__Alternatives )
            // InternalEcore2XtextTest.g:104:2: rule__Abstract__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Abstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleConcrete0"
    // InternalEcore2XtextTest.g:116:1: entryRuleConcrete0 : ruleConcrete0 EOF ;
    public final void entryRuleConcrete0() throws RecognitionException {
        try {
            // InternalEcore2XtextTest.g:117:1: ( ruleConcrete0 EOF )
            // InternalEcore2XtextTest.g:118:1: ruleConcrete0 EOF
            {
             before(grammarAccess.getConcrete0Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConcrete0();

            state._fsp--;

             after(grammarAccess.getConcrete0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcrete0"


    // $ANTLR start "ruleConcrete0"
    // InternalEcore2XtextTest.g:125:1: ruleConcrete0 : ( ( rule__Concrete0__Alternatives ) ) ;
    public final void ruleConcrete0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:129:2: ( ( ( rule__Concrete0__Alternatives ) ) )
            // InternalEcore2XtextTest.g:130:1: ( ( rule__Concrete0__Alternatives ) )
            {
            // InternalEcore2XtextTest.g:130:1: ( ( rule__Concrete0__Alternatives ) )
            // InternalEcore2XtextTest.g:131:1: ( rule__Concrete0__Alternatives )
            {
             before(grammarAccess.getConcrete0Access().getAlternatives()); 
            // InternalEcore2XtextTest.g:132:1: ( rule__Concrete0__Alternatives )
            // InternalEcore2XtextTest.g:132:2: rule__Concrete0__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete0__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConcrete0Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcrete0"


    // $ANTLR start "entryRuleINT0"
    // InternalEcore2XtextTest.g:144:1: entryRuleINT0 : ruleINT0 EOF ;
    public final void entryRuleINT0() throws RecognitionException {
        try {
            // InternalEcore2XtextTest.g:145:1: ( ruleINT0 EOF )
            // InternalEcore2XtextTest.g:146:1: ruleINT0 EOF
            {
             before(grammarAccess.getINT0Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleINT0();

            state._fsp--;

             after(grammarAccess.getINT0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINT0"


    // $ANTLR start "ruleINT0"
    // InternalEcore2XtextTest.g:153:1: ruleINT0 : ( 'INT' ) ;
    public final void ruleINT0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:157:2: ( ( 'INT' ) )
            // InternalEcore2XtextTest.g:158:1: ( 'INT' )
            {
            // InternalEcore2XtextTest.g:158:1: ( 'INT' )
            // InternalEcore2XtextTest.g:159:1: 'INT'
            {
             before(grammarAccess.getINT0Access().getINTKeyword()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getINT0Access().getINTKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINT0"


    // $ANTLR start "entryRuleConcrete0_Impl"
    // InternalEcore2XtextTest.g:174:1: entryRuleConcrete0_Impl : ruleConcrete0_Impl EOF ;
    public final void entryRuleConcrete0_Impl() throws RecognitionException {
        try {
            // InternalEcore2XtextTest.g:175:1: ( ruleConcrete0_Impl EOF )
            // InternalEcore2XtextTest.g:176:1: ruleConcrete0_Impl EOF
            {
             before(grammarAccess.getConcrete0_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConcrete0_Impl();

            state._fsp--;

             after(grammarAccess.getConcrete0_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcrete0_Impl"


    // $ANTLR start "ruleConcrete0_Impl"
    // InternalEcore2XtextTest.g:183:1: ruleConcrete0_Impl : ( ( rule__Concrete0_Impl__Group__0 ) ) ;
    public final void ruleConcrete0_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:187:2: ( ( ( rule__Concrete0_Impl__Group__0 ) ) )
            // InternalEcore2XtextTest.g:188:1: ( ( rule__Concrete0_Impl__Group__0 ) )
            {
            // InternalEcore2XtextTest.g:188:1: ( ( rule__Concrete0_Impl__Group__0 ) )
            // InternalEcore2XtextTest.g:189:1: ( rule__Concrete0_Impl__Group__0 )
            {
             before(grammarAccess.getConcrete0_ImplAccess().getGroup()); 
            // InternalEcore2XtextTest.g:190:1: ( rule__Concrete0_Impl__Group__0 )
            // InternalEcore2XtextTest.g:190:2: rule__Concrete0_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete0_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcrete0_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcrete0_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalEcore2XtextTest.g:202:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEcore2XtextTest.g:203:1: ( ruleEString EOF )
            // InternalEcore2XtextTest.g:204:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEcore2XtextTest.g:211:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:215:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEcore2XtextTest.g:216:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalEcore2XtextTest.g:216:1: ( ( rule__EString__Alternatives ) )
            // InternalEcore2XtextTest.g:217:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEcore2XtextTest.g:218:1: ( rule__EString__Alternatives )
            // InternalEcore2XtextTest.g:218:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleConcrete1_Impl"
    // InternalEcore2XtextTest.g:230:1: entryRuleConcrete1_Impl : ruleConcrete1_Impl EOF ;
    public final void entryRuleConcrete1_Impl() throws RecognitionException {
        try {
            // InternalEcore2XtextTest.g:231:1: ( ruleConcrete1_Impl EOF )
            // InternalEcore2XtextTest.g:232:1: ruleConcrete1_Impl EOF
            {
             before(grammarAccess.getConcrete1_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConcrete1_Impl();

            state._fsp--;

             after(grammarAccess.getConcrete1_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcrete1_Impl"


    // $ANTLR start "ruleConcrete1_Impl"
    // InternalEcore2XtextTest.g:239:1: ruleConcrete1_Impl : ( ( rule__Concrete1_Impl__Group__0 ) ) ;
    public final void ruleConcrete1_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:243:2: ( ( ( rule__Concrete1_Impl__Group__0 ) ) )
            // InternalEcore2XtextTest.g:244:1: ( ( rule__Concrete1_Impl__Group__0 ) )
            {
            // InternalEcore2XtextTest.g:244:1: ( ( rule__Concrete1_Impl__Group__0 ) )
            // InternalEcore2XtextTest.g:245:1: ( rule__Concrete1_Impl__Group__0 )
            {
             before(grammarAccess.getConcrete1_ImplAccess().getGroup()); 
            // InternalEcore2XtextTest.g:246:1: ( rule__Concrete1_Impl__Group__0 )
            // InternalEcore2XtextTest.g:246:2: rule__Concrete1_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete1_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcrete1_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcrete1_Impl"


    // $ANTLR start "entryRuleDiamondInheritance"
    // InternalEcore2XtextTest.g:258:1: entryRuleDiamondInheritance : ruleDiamondInheritance EOF ;
    public final void entryRuleDiamondInheritance() throws RecognitionException {
        try {
            // InternalEcore2XtextTest.g:259:1: ( ruleDiamondInheritance EOF )
            // InternalEcore2XtextTest.g:260:1: ruleDiamondInheritance EOF
            {
             before(grammarAccess.getDiamondInheritanceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDiamondInheritance();

            state._fsp--;

             after(grammarAccess.getDiamondInheritanceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiamondInheritance"


    // $ANTLR start "ruleDiamondInheritance"
    // InternalEcore2XtextTest.g:267:1: ruleDiamondInheritance : ( ( rule__DiamondInheritance__Group__0 ) ) ;
    public final void ruleDiamondInheritance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:271:2: ( ( ( rule__DiamondInheritance__Group__0 ) ) )
            // InternalEcore2XtextTest.g:272:1: ( ( rule__DiamondInheritance__Group__0 ) )
            {
            // InternalEcore2XtextTest.g:272:1: ( ( rule__DiamondInheritance__Group__0 ) )
            // InternalEcore2XtextTest.g:273:1: ( rule__DiamondInheritance__Group__0 )
            {
             before(grammarAccess.getDiamondInheritanceAccess().getGroup()); 
            // InternalEcore2XtextTest.g:274:1: ( rule__DiamondInheritance__Group__0 )
            // InternalEcore2XtextTest.g:274:2: rule__DiamondInheritance__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DiamondInheritance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiamondInheritanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiamondInheritance"


    // $ANTLR start "rule__Abstract__Alternatives"
    // InternalEcore2XtextTest.g:286:1: rule__Abstract__Alternatives : ( ( ruleConcrete0_Impl ) | ( ruleConcrete1_Impl ) | ( ruleDiamondInheritance ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:290:1: ( ( ruleConcrete0_Impl ) | ( ruleConcrete1_Impl ) | ( ruleDiamondInheritance ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEcore2XtextTest.g:291:1: ( ruleConcrete0_Impl )
                    {
                    // InternalEcore2XtextTest.g:291:1: ( ruleConcrete0_Impl )
                    // InternalEcore2XtextTest.g:292:1: ruleConcrete0_Impl
                    {
                     before(grammarAccess.getAbstractAccess().getConcrete0_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleConcrete0_Impl();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getConcrete0_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcore2XtextTest.g:297:6: ( ruleConcrete1_Impl )
                    {
                    // InternalEcore2XtextTest.g:297:6: ( ruleConcrete1_Impl )
                    // InternalEcore2XtextTest.g:298:1: ruleConcrete1_Impl
                    {
                     before(grammarAccess.getAbstractAccess().getConcrete1_ImplParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleConcrete1_Impl();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getConcrete1_ImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEcore2XtextTest.g:303:6: ( ruleDiamondInheritance )
                    {
                    // InternalEcore2XtextTest.g:303:6: ( ruleDiamondInheritance )
                    // InternalEcore2XtextTest.g:304:1: ruleDiamondInheritance
                    {
                     before(grammarAccess.getAbstractAccess().getDiamondInheritanceParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDiamondInheritance();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getDiamondInheritanceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Alternatives"


    // $ANTLR start "rule__Concrete0__Alternatives"
    // InternalEcore2XtextTest.g:314:1: rule__Concrete0__Alternatives : ( ( ruleConcrete0_Impl ) | ( ruleDiamondInheritance ) );
    public final void rule__Concrete0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:318:1: ( ( ruleConcrete0_Impl ) | ( ruleDiamondInheritance ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEcore2XtextTest.g:319:1: ( ruleConcrete0_Impl )
                    {
                    // InternalEcore2XtextTest.g:319:1: ( ruleConcrete0_Impl )
                    // InternalEcore2XtextTest.g:320:1: ruleConcrete0_Impl
                    {
                     before(grammarAccess.getConcrete0Access().getConcrete0_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleConcrete0_Impl();

                    state._fsp--;

                     after(grammarAccess.getConcrete0Access().getConcrete0_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcore2XtextTest.g:325:6: ( ruleDiamondInheritance )
                    {
                    // InternalEcore2XtextTest.g:325:6: ( ruleDiamondInheritance )
                    // InternalEcore2XtextTest.g:326:1: ruleDiamondInheritance
                    {
                     before(grammarAccess.getConcrete0Access().getDiamondInheritanceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDiamondInheritance();

                    state._fsp--;

                     after(grammarAccess.getConcrete0Access().getDiamondInheritanceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete0__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEcore2XtextTest.g:336:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:340:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEcore2XtextTest.g:341:1: ( RULE_STRING )
                    {
                    // InternalEcore2XtextTest.g:341:1: ( RULE_STRING )
                    // InternalEcore2XtextTest.g:342:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcore2XtextTest.g:347:6: ( RULE_ID )
                    {
                    // InternalEcore2XtextTest.g:347:6: ( RULE_ID )
                    // InternalEcore2XtextTest.g:348:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // InternalEcore2XtextTest.g:360:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:364:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalEcore2XtextTest.g:365:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalEcore2XtextTest.g:372:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:376:1: ( ( () ) )
            // InternalEcore2XtextTest.g:377:1: ( () )
            {
            // InternalEcore2XtextTest.g:377:1: ( () )
            // InternalEcore2XtextTest.g:378:1: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0()); 
            // InternalEcore2XtextTest.g:379:1: ()
            // InternalEcore2XtextTest.g:381:1: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalEcore2XtextTest.g:391:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:395:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalEcore2XtextTest.g:396:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalEcore2XtextTest.g:403:1: rule__Root__Group__1__Impl : ( 'Root' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:407:1: ( ( 'Root' ) )
            // InternalEcore2XtextTest.g:408:1: ( 'Root' )
            {
            // InternalEcore2XtextTest.g:408:1: ( 'Root' )
            // InternalEcore2XtextTest.g:409:1: 'Root'
            {
             before(grammarAccess.getRootAccess().getRootKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRootKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalEcore2XtextTest.g:422:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:426:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalEcore2XtextTest.g:427:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalEcore2XtextTest.g:434:1: rule__Root__Group__2__Impl : ( ( rule__Root__NameAssignment_2 ) ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:438:1: ( ( ( rule__Root__NameAssignment_2 ) ) )
            // InternalEcore2XtextTest.g:439:1: ( ( rule__Root__NameAssignment_2 ) )
            {
            // InternalEcore2XtextTest.g:439:1: ( ( rule__Root__NameAssignment_2 ) )
            // InternalEcore2XtextTest.g:440:1: ( rule__Root__NameAssignment_2 )
            {
             before(grammarAccess.getRootAccess().getNameAssignment_2()); 
            // InternalEcore2XtextTest.g:441:1: ( rule__Root__NameAssignment_2 )
            // InternalEcore2XtextTest.g:441:2: rule__Root__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalEcore2XtextTest.g:451:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:455:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalEcore2XtextTest.g:456:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalEcore2XtextTest.g:463:1: rule__Root__Group__3__Impl : ( '{' ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:467:1: ( ( '{' ) )
            // InternalEcore2XtextTest.g:468:1: ( '{' )
            {
            // InternalEcore2XtextTest.g:468:1: ( '{' )
            // InternalEcore2XtextTest.g:469:1: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalEcore2XtextTest.g:482:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:486:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalEcore2XtextTest.g:487:2: rule__Root__Group__4__Impl rule__Root__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Root__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalEcore2XtextTest.g:494:1: rule__Root__Group__4__Impl : ( ( rule__Root__Group_4__0 )? ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:498:1: ( ( ( rule__Root__Group_4__0 )? ) )
            // InternalEcore2XtextTest.g:499:1: ( ( rule__Root__Group_4__0 )? )
            {
            // InternalEcore2XtextTest.g:499:1: ( ( rule__Root__Group_4__0 )? )
            // InternalEcore2XtextTest.g:500:1: ( rule__Root__Group_4__0 )?
            {
             before(grammarAccess.getRootAccess().getGroup_4()); 
            // InternalEcore2XtextTest.g:501:1: ( rule__Root__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEcore2XtextTest.g:501:2: rule__Root__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Root__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__5"
    // InternalEcore2XtextTest.g:511:1: rule__Root__Group__5 : rule__Root__Group__5__Impl rule__Root__Group__6 ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:515:1: ( rule__Root__Group__5__Impl rule__Root__Group__6 )
            // InternalEcore2XtextTest.g:516:2: rule__Root__Group__5__Impl rule__Root__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Root__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__5"


    // $ANTLR start "rule__Root__Group__5__Impl"
    // InternalEcore2XtextTest.g:523:1: rule__Root__Group__5__Impl : ( ( rule__Root__Group_5__0 )? ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:527:1: ( ( ( rule__Root__Group_5__0 )? ) )
            // InternalEcore2XtextTest.g:528:1: ( ( rule__Root__Group_5__0 )? )
            {
            // InternalEcore2XtextTest.g:528:1: ( ( rule__Root__Group_5__0 )? )
            // InternalEcore2XtextTest.g:529:1: ( rule__Root__Group_5__0 )?
            {
             before(grammarAccess.getRootAccess().getGroup_5()); 
            // InternalEcore2XtextTest.g:530:1: ( rule__Root__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEcore2XtextTest.g:530:2: rule__Root__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Root__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__5__Impl"


    // $ANTLR start "rule__Root__Group__6"
    // InternalEcore2XtextTest.g:540:1: rule__Root__Group__6 : rule__Root__Group__6__Impl ;
    public final void rule__Root__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:544:1: ( rule__Root__Group__6__Impl )
            // InternalEcore2XtextTest.g:545:2: rule__Root__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__6"


    // $ANTLR start "rule__Root__Group__6__Impl"
    // InternalEcore2XtextTest.g:551:1: rule__Root__Group__6__Impl : ( '}' ) ;
    public final void rule__Root__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:555:1: ( ( '}' ) )
            // InternalEcore2XtextTest.g:556:1: ( '}' )
            {
            // InternalEcore2XtextTest.g:556:1: ( '}' )
            // InternalEcore2XtextTest.g:557:1: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__6__Impl"


    // $ANTLR start "rule__Root__Group_4__0"
    // InternalEcore2XtextTest.g:584:1: rule__Root__Group_4__0 : rule__Root__Group_4__0__Impl rule__Root__Group_4__1 ;
    public final void rule__Root__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:588:1: ( rule__Root__Group_4__0__Impl rule__Root__Group_4__1 )
            // InternalEcore2XtextTest.g:589:2: rule__Root__Group_4__0__Impl rule__Root__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Root__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__0"


    // $ANTLR start "rule__Root__Group_4__0__Impl"
    // InternalEcore2XtextTest.g:596:1: rule__Root__Group_4__0__Impl : ( 'classes' ) ;
    public final void rule__Root__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:600:1: ( ( 'classes' ) )
            // InternalEcore2XtextTest.g:601:1: ( 'classes' )
            {
            // InternalEcore2XtextTest.g:601:1: ( 'classes' )
            // InternalEcore2XtextTest.g:602:1: 'classes'
            {
             before(grammarAccess.getRootAccess().getClassesKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRootAccess().getClassesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__0__Impl"


    // $ANTLR start "rule__Root__Group_4__1"
    // InternalEcore2XtextTest.g:615:1: rule__Root__Group_4__1 : rule__Root__Group_4__1__Impl rule__Root__Group_4__2 ;
    public final void rule__Root__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:619:1: ( rule__Root__Group_4__1__Impl rule__Root__Group_4__2 )
            // InternalEcore2XtextTest.g:620:2: rule__Root__Group_4__1__Impl rule__Root__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Root__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__1"


    // $ANTLR start "rule__Root__Group_4__1__Impl"
    // InternalEcore2XtextTest.g:627:1: rule__Root__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Root__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:631:1: ( ( '{' ) )
            // InternalEcore2XtextTest.g:632:1: ( '{' )
            {
            // InternalEcore2XtextTest.g:632:1: ( '{' )
            // InternalEcore2XtextTest.g:633:1: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__1__Impl"


    // $ANTLR start "rule__Root__Group_4__2"
    // InternalEcore2XtextTest.g:646:1: rule__Root__Group_4__2 : rule__Root__Group_4__2__Impl rule__Root__Group_4__3 ;
    public final void rule__Root__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:650:1: ( rule__Root__Group_4__2__Impl rule__Root__Group_4__3 )
            // InternalEcore2XtextTest.g:651:2: rule__Root__Group_4__2__Impl rule__Root__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Root__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__2"


    // $ANTLR start "rule__Root__Group_4__2__Impl"
    // InternalEcore2XtextTest.g:658:1: rule__Root__Group_4__2__Impl : ( ( rule__Root__ClassesAssignment_4_2 ) ) ;
    public final void rule__Root__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:662:1: ( ( ( rule__Root__ClassesAssignment_4_2 ) ) )
            // InternalEcore2XtextTest.g:663:1: ( ( rule__Root__ClassesAssignment_4_2 ) )
            {
            // InternalEcore2XtextTest.g:663:1: ( ( rule__Root__ClassesAssignment_4_2 ) )
            // InternalEcore2XtextTest.g:664:1: ( rule__Root__ClassesAssignment_4_2 )
            {
             before(grammarAccess.getRootAccess().getClassesAssignment_4_2()); 
            // InternalEcore2XtextTest.g:665:1: ( rule__Root__ClassesAssignment_4_2 )
            // InternalEcore2XtextTest.g:665:2: rule__Root__ClassesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__ClassesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getClassesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__2__Impl"


    // $ANTLR start "rule__Root__Group_4__3"
    // InternalEcore2XtextTest.g:675:1: rule__Root__Group_4__3 : rule__Root__Group_4__3__Impl rule__Root__Group_4__4 ;
    public final void rule__Root__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:679:1: ( rule__Root__Group_4__3__Impl rule__Root__Group_4__4 )
            // InternalEcore2XtextTest.g:680:2: rule__Root__Group_4__3__Impl rule__Root__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Root__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__3"


    // $ANTLR start "rule__Root__Group_4__3__Impl"
    // InternalEcore2XtextTest.g:687:1: rule__Root__Group_4__3__Impl : ( ( rule__Root__Group_4_3__0 )* ) ;
    public final void rule__Root__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:691:1: ( ( ( rule__Root__Group_4_3__0 )* ) )
            // InternalEcore2XtextTest.g:692:1: ( ( rule__Root__Group_4_3__0 )* )
            {
            // InternalEcore2XtextTest.g:692:1: ( ( rule__Root__Group_4_3__0 )* )
            // InternalEcore2XtextTest.g:693:1: ( rule__Root__Group_4_3__0 )*
            {
             before(grammarAccess.getRootAccess().getGroup_4_3()); 
            // InternalEcore2XtextTest.g:694:1: ( rule__Root__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEcore2XtextTest.g:694:2: rule__Root__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__Root__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__3__Impl"


    // $ANTLR start "rule__Root__Group_4__4"
    // InternalEcore2XtextTest.g:704:1: rule__Root__Group_4__4 : rule__Root__Group_4__4__Impl ;
    public final void rule__Root__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:708:1: ( rule__Root__Group_4__4__Impl )
            // InternalEcore2XtextTest.g:709:2: rule__Root__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__4"


    // $ANTLR start "rule__Root__Group_4__4__Impl"
    // InternalEcore2XtextTest.g:715:1: rule__Root__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Root__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:719:1: ( ( '}' ) )
            // InternalEcore2XtextTest.g:720:1: ( '}' )
            {
            // InternalEcore2XtextTest.g:720:1: ( '}' )
            // InternalEcore2XtextTest.g:721:1: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__4__Impl"


    // $ANTLR start "rule__Root__Group_4_3__0"
    // InternalEcore2XtextTest.g:744:1: rule__Root__Group_4_3__0 : rule__Root__Group_4_3__0__Impl rule__Root__Group_4_3__1 ;
    public final void rule__Root__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:748:1: ( rule__Root__Group_4_3__0__Impl rule__Root__Group_4_3__1 )
            // InternalEcore2XtextTest.g:749:2: rule__Root__Group_4_3__0__Impl rule__Root__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Root__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4_3__0"


    // $ANTLR start "rule__Root__Group_4_3__0__Impl"
    // InternalEcore2XtextTest.g:756:1: rule__Root__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Root__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:760:1: ( ( ',' ) )
            // InternalEcore2XtextTest.g:761:1: ( ',' )
            {
            // InternalEcore2XtextTest.g:761:1: ( ',' )
            // InternalEcore2XtextTest.g:762:1: ','
            {
             before(grammarAccess.getRootAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRootAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4_3__0__Impl"


    // $ANTLR start "rule__Root__Group_4_3__1"
    // InternalEcore2XtextTest.g:775:1: rule__Root__Group_4_3__1 : rule__Root__Group_4_3__1__Impl ;
    public final void rule__Root__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:779:1: ( rule__Root__Group_4_3__1__Impl )
            // InternalEcore2XtextTest.g:780:2: rule__Root__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4_3__1"


    // $ANTLR start "rule__Root__Group_4_3__1__Impl"
    // InternalEcore2XtextTest.g:786:1: rule__Root__Group_4_3__1__Impl : ( ( rule__Root__ClassesAssignment_4_3_1 ) ) ;
    public final void rule__Root__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:790:1: ( ( ( rule__Root__ClassesAssignment_4_3_1 ) ) )
            // InternalEcore2XtextTest.g:791:1: ( ( rule__Root__ClassesAssignment_4_3_1 ) )
            {
            // InternalEcore2XtextTest.g:791:1: ( ( rule__Root__ClassesAssignment_4_3_1 ) )
            // InternalEcore2XtextTest.g:792:1: ( rule__Root__ClassesAssignment_4_3_1 )
            {
             before(grammarAccess.getRootAccess().getClassesAssignment_4_3_1()); 
            // InternalEcore2XtextTest.g:793:1: ( rule__Root__ClassesAssignment_4_3_1 )
            // InternalEcore2XtextTest.g:793:2: rule__Root__ClassesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__ClassesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getClassesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4_3__1__Impl"


    // $ANTLR start "rule__Root__Group_5__0"
    // InternalEcore2XtextTest.g:807:1: rule__Root__Group_5__0 : rule__Root__Group_5__0__Impl rule__Root__Group_5__1 ;
    public final void rule__Root__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:811:1: ( rule__Root__Group_5__0__Impl rule__Root__Group_5__1 )
            // InternalEcore2XtextTest.g:812:2: rule__Root__Group_5__0__Impl rule__Root__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Root__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_5__0"


    // $ANTLR start "rule__Root__Group_5__0__Impl"
    // InternalEcore2XtextTest.g:819:1: rule__Root__Group_5__0__Impl : ( 'concrete0' ) ;
    public final void rule__Root__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:823:1: ( ( 'concrete0' ) )
            // InternalEcore2XtextTest.g:824:1: ( 'concrete0' )
            {
            // InternalEcore2XtextTest.g:824:1: ( 'concrete0' )
            // InternalEcore2XtextTest.g:825:1: 'concrete0'
            {
             before(grammarAccess.getRootAccess().getConcrete0Keyword_5_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRootAccess().getConcrete0Keyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_5__0__Impl"


    // $ANTLR start "rule__Root__Group_5__1"
    // InternalEcore2XtextTest.g:838:1: rule__Root__Group_5__1 : rule__Root__Group_5__1__Impl ;
    public final void rule__Root__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:842:1: ( rule__Root__Group_5__1__Impl )
            // InternalEcore2XtextTest.g:843:2: rule__Root__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_5__1"


    // $ANTLR start "rule__Root__Group_5__1__Impl"
    // InternalEcore2XtextTest.g:849:1: rule__Root__Group_5__1__Impl : ( ( rule__Root__Concrete0Assignment_5_1 ) ) ;
    public final void rule__Root__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:853:1: ( ( ( rule__Root__Concrete0Assignment_5_1 ) ) )
            // InternalEcore2XtextTest.g:854:1: ( ( rule__Root__Concrete0Assignment_5_1 ) )
            {
            // InternalEcore2XtextTest.g:854:1: ( ( rule__Root__Concrete0Assignment_5_1 ) )
            // InternalEcore2XtextTest.g:855:1: ( rule__Root__Concrete0Assignment_5_1 )
            {
             before(grammarAccess.getRootAccess().getConcrete0Assignment_5_1()); 
            // InternalEcore2XtextTest.g:856:1: ( rule__Root__Concrete0Assignment_5_1 )
            // InternalEcore2XtextTest.g:856:2: rule__Root__Concrete0Assignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Concrete0Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getConcrete0Assignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_5__1__Impl"


    // $ANTLR start "rule__Concrete0_Impl__Group__0"
    // InternalEcore2XtextTest.g:870:1: rule__Concrete0_Impl__Group__0 : rule__Concrete0_Impl__Group__0__Impl rule__Concrete0_Impl__Group__1 ;
    public final void rule__Concrete0_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:874:1: ( rule__Concrete0_Impl__Group__0__Impl rule__Concrete0_Impl__Group__1 )
            // InternalEcore2XtextTest.g:875:2: rule__Concrete0_Impl__Group__0__Impl rule__Concrete0_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Concrete0_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete0_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete0_Impl__Group__0"


    // $ANTLR start "rule__Concrete0_Impl__Group__0__Impl"
    // InternalEcore2XtextTest.g:882:1: rule__Concrete0_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Concrete0_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:886:1: ( ( () ) )
            // InternalEcore2XtextTest.g:887:1: ( () )
            {
            // InternalEcore2XtextTest.g:887:1: ( () )
            // InternalEcore2XtextTest.g:888:1: ()
            {
             before(grammarAccess.getConcrete0_ImplAccess().getConcrete0Action_0()); 
            // InternalEcore2XtextTest.g:889:1: ()
            // InternalEcore2XtextTest.g:891:1: 
            {
            }

             after(grammarAccess.getConcrete0_ImplAccess().getConcrete0Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete0_Impl__Group__0__Impl"


    // $ANTLR start "rule__Concrete0_Impl__Group__1"
    // InternalEcore2XtextTest.g:901:1: rule__Concrete0_Impl__Group__1 : rule__Concrete0_Impl__Group__1__Impl rule__Concrete0_Impl__Group__2 ;
    public final void rule__Concrete0_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:905:1: ( rule__Concrete0_Impl__Group__1__Impl rule__Concrete0_Impl__Group__2 )
            // InternalEcore2XtextTest.g:906:2: rule__Concrete0_Impl__Group__1__Impl rule__Concrete0_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Concrete0_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete0_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete0_Impl__Group__1"


    // $ANTLR start "rule__Concrete0_Impl__Group__1__Impl"
    // InternalEcore2XtextTest.g:913:1: rule__Concrete0_Impl__Group__1__Impl : ( 'Concrete0' ) ;
    public final void rule__Concrete0_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:917:1: ( ( 'Concrete0' ) )
            // InternalEcore2XtextTest.g:918:1: ( 'Concrete0' )
            {
            // InternalEcore2XtextTest.g:918:1: ( 'Concrete0' )
            // InternalEcore2XtextTest.g:919:1: 'Concrete0'
            {
             before(grammarAccess.getConcrete0_ImplAccess().getConcrete0Keyword_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getConcrete0_ImplAccess().getConcrete0Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete0_Impl__Group__1__Impl"


    // $ANTLR start "rule__Concrete0_Impl__Group__2"
    // InternalEcore2XtextTest.g:932:1: rule__Concrete0_Impl__Group__2 : rule__Concrete0_Impl__Group__2__Impl ;
    public final void rule__Concrete0_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:936:1: ( rule__Concrete0_Impl__Group__2__Impl )
            // InternalEcore2XtextTest.g:937:2: rule__Concrete0_Impl__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete0_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete0_Impl__Group__2"


    // $ANTLR start "rule__Concrete0_Impl__Group__2__Impl"
    // InternalEcore2XtextTest.g:943:1: rule__Concrete0_Impl__Group__2__Impl : ( ( rule__Concrete0_Impl__NameAssignment_2 ) ) ;
    public final void rule__Concrete0_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:947:1: ( ( ( rule__Concrete0_Impl__NameAssignment_2 ) ) )
            // InternalEcore2XtextTest.g:948:1: ( ( rule__Concrete0_Impl__NameAssignment_2 ) )
            {
            // InternalEcore2XtextTest.g:948:1: ( ( rule__Concrete0_Impl__NameAssignment_2 ) )
            // InternalEcore2XtextTest.g:949:1: ( rule__Concrete0_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getConcrete0_ImplAccess().getNameAssignment_2()); 
            // InternalEcore2XtextTest.g:950:1: ( rule__Concrete0_Impl__NameAssignment_2 )
            // InternalEcore2XtextTest.g:950:2: rule__Concrete0_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete0_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcrete0_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete0_Impl__Group__2__Impl"


    // $ANTLR start "rule__Concrete1_Impl__Group__0"
    // InternalEcore2XtextTest.g:966:1: rule__Concrete1_Impl__Group__0 : rule__Concrete1_Impl__Group__0__Impl rule__Concrete1_Impl__Group__1 ;
    public final void rule__Concrete1_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:970:1: ( rule__Concrete1_Impl__Group__0__Impl rule__Concrete1_Impl__Group__1 )
            // InternalEcore2XtextTest.g:971:2: rule__Concrete1_Impl__Group__0__Impl rule__Concrete1_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Concrete1_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete1_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete1_Impl__Group__0"


    // $ANTLR start "rule__Concrete1_Impl__Group__0__Impl"
    // InternalEcore2XtextTest.g:978:1: rule__Concrete1_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Concrete1_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:982:1: ( ( () ) )
            // InternalEcore2XtextTest.g:983:1: ( () )
            {
            // InternalEcore2XtextTest.g:983:1: ( () )
            // InternalEcore2XtextTest.g:984:1: ()
            {
             before(grammarAccess.getConcrete1_ImplAccess().getConcrete1Action_0()); 
            // InternalEcore2XtextTest.g:985:1: ()
            // InternalEcore2XtextTest.g:987:1: 
            {
            }

             after(grammarAccess.getConcrete1_ImplAccess().getConcrete1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete1_Impl__Group__0__Impl"


    // $ANTLR start "rule__Concrete1_Impl__Group__1"
    // InternalEcore2XtextTest.g:997:1: rule__Concrete1_Impl__Group__1 : rule__Concrete1_Impl__Group__1__Impl rule__Concrete1_Impl__Group__2 ;
    public final void rule__Concrete1_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1001:1: ( rule__Concrete1_Impl__Group__1__Impl rule__Concrete1_Impl__Group__2 )
            // InternalEcore2XtextTest.g:1002:2: rule__Concrete1_Impl__Group__1__Impl rule__Concrete1_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Concrete1_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete1_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete1_Impl__Group__1"


    // $ANTLR start "rule__Concrete1_Impl__Group__1__Impl"
    // InternalEcore2XtextTest.g:1009:1: rule__Concrete1_Impl__Group__1__Impl : ( 'Concrete1' ) ;
    public final void rule__Concrete1_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1013:1: ( ( 'Concrete1' ) )
            // InternalEcore2XtextTest.g:1014:1: ( 'Concrete1' )
            {
            // InternalEcore2XtextTest.g:1014:1: ( 'Concrete1' )
            // InternalEcore2XtextTest.g:1015:1: 'Concrete1'
            {
             before(grammarAccess.getConcrete1_ImplAccess().getConcrete1Keyword_1()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getConcrete1_ImplAccess().getConcrete1Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete1_Impl__Group__1__Impl"


    // $ANTLR start "rule__Concrete1_Impl__Group__2"
    // InternalEcore2XtextTest.g:1028:1: rule__Concrete1_Impl__Group__2 : rule__Concrete1_Impl__Group__2__Impl ;
    public final void rule__Concrete1_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1032:1: ( rule__Concrete1_Impl__Group__2__Impl )
            // InternalEcore2XtextTest.g:1033:2: rule__Concrete1_Impl__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete1_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete1_Impl__Group__2"


    // $ANTLR start "rule__Concrete1_Impl__Group__2__Impl"
    // InternalEcore2XtextTest.g:1039:1: rule__Concrete1_Impl__Group__2__Impl : ( ( rule__Concrete1_Impl__NameAssignment_2 ) ) ;
    public final void rule__Concrete1_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1043:1: ( ( ( rule__Concrete1_Impl__NameAssignment_2 ) ) )
            // InternalEcore2XtextTest.g:1044:1: ( ( rule__Concrete1_Impl__NameAssignment_2 ) )
            {
            // InternalEcore2XtextTest.g:1044:1: ( ( rule__Concrete1_Impl__NameAssignment_2 ) )
            // InternalEcore2XtextTest.g:1045:1: ( rule__Concrete1_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getConcrete1_ImplAccess().getNameAssignment_2()); 
            // InternalEcore2XtextTest.g:1046:1: ( rule__Concrete1_Impl__NameAssignment_2 )
            // InternalEcore2XtextTest.g:1046:2: rule__Concrete1_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Concrete1_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcrete1_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete1_Impl__Group__2__Impl"


    // $ANTLR start "rule__DiamondInheritance__Group__0"
    // InternalEcore2XtextTest.g:1062:1: rule__DiamondInheritance__Group__0 : rule__DiamondInheritance__Group__0__Impl rule__DiamondInheritance__Group__1 ;
    public final void rule__DiamondInheritance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1066:1: ( rule__DiamondInheritance__Group__0__Impl rule__DiamondInheritance__Group__1 )
            // InternalEcore2XtextTest.g:1067:2: rule__DiamondInheritance__Group__0__Impl rule__DiamondInheritance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DiamondInheritance__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DiamondInheritance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiamondInheritance__Group__0"


    // $ANTLR start "rule__DiamondInheritance__Group__0__Impl"
    // InternalEcore2XtextTest.g:1074:1: rule__DiamondInheritance__Group__0__Impl : ( () ) ;
    public final void rule__DiamondInheritance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1078:1: ( ( () ) )
            // InternalEcore2XtextTest.g:1079:1: ( () )
            {
            // InternalEcore2XtextTest.g:1079:1: ( () )
            // InternalEcore2XtextTest.g:1080:1: ()
            {
             before(grammarAccess.getDiamondInheritanceAccess().getDiamondInheritanceAction_0()); 
            // InternalEcore2XtextTest.g:1081:1: ()
            // InternalEcore2XtextTest.g:1083:1: 
            {
            }

             after(grammarAccess.getDiamondInheritanceAccess().getDiamondInheritanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiamondInheritance__Group__0__Impl"


    // $ANTLR start "rule__DiamondInheritance__Group__1"
    // InternalEcore2XtextTest.g:1093:1: rule__DiamondInheritance__Group__1 : rule__DiamondInheritance__Group__1__Impl rule__DiamondInheritance__Group__2 ;
    public final void rule__DiamondInheritance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1097:1: ( rule__DiamondInheritance__Group__1__Impl rule__DiamondInheritance__Group__2 )
            // InternalEcore2XtextTest.g:1098:2: rule__DiamondInheritance__Group__1__Impl rule__DiamondInheritance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DiamondInheritance__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DiamondInheritance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiamondInheritance__Group__1"


    // $ANTLR start "rule__DiamondInheritance__Group__1__Impl"
    // InternalEcore2XtextTest.g:1105:1: rule__DiamondInheritance__Group__1__Impl : ( 'DiamondInheritance' ) ;
    public final void rule__DiamondInheritance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1109:1: ( ( 'DiamondInheritance' ) )
            // InternalEcore2XtextTest.g:1110:1: ( 'DiamondInheritance' )
            {
            // InternalEcore2XtextTest.g:1110:1: ( 'DiamondInheritance' )
            // InternalEcore2XtextTest.g:1111:1: 'DiamondInheritance'
            {
             before(grammarAccess.getDiamondInheritanceAccess().getDiamondInheritanceKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDiamondInheritanceAccess().getDiamondInheritanceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiamondInheritance__Group__1__Impl"


    // $ANTLR start "rule__DiamondInheritance__Group__2"
    // InternalEcore2XtextTest.g:1124:1: rule__DiamondInheritance__Group__2 : rule__DiamondInheritance__Group__2__Impl ;
    public final void rule__DiamondInheritance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1128:1: ( rule__DiamondInheritance__Group__2__Impl )
            // InternalEcore2XtextTest.g:1129:2: rule__DiamondInheritance__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DiamondInheritance__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiamondInheritance__Group__2"


    // $ANTLR start "rule__DiamondInheritance__Group__2__Impl"
    // InternalEcore2XtextTest.g:1135:1: rule__DiamondInheritance__Group__2__Impl : ( ( rule__DiamondInheritance__NameAssignment_2 ) ) ;
    public final void rule__DiamondInheritance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1139:1: ( ( ( rule__DiamondInheritance__NameAssignment_2 ) ) )
            // InternalEcore2XtextTest.g:1140:1: ( ( rule__DiamondInheritance__NameAssignment_2 ) )
            {
            // InternalEcore2XtextTest.g:1140:1: ( ( rule__DiamondInheritance__NameAssignment_2 ) )
            // InternalEcore2XtextTest.g:1141:1: ( rule__DiamondInheritance__NameAssignment_2 )
            {
             before(grammarAccess.getDiamondInheritanceAccess().getNameAssignment_2()); 
            // InternalEcore2XtextTest.g:1142:1: ( rule__DiamondInheritance__NameAssignment_2 )
            // InternalEcore2XtextTest.g:1142:2: rule__DiamondInheritance__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DiamondInheritance__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDiamondInheritanceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiamondInheritance__Group__2__Impl"


    // $ANTLR start "rule__Root__NameAssignment_2"
    // InternalEcore2XtextTest.g:1159:1: rule__Root__NameAssignment_2 : ( ruleINT0 ) ;
    public final void rule__Root__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1163:1: ( ( ruleINT0 ) )
            // InternalEcore2XtextTest.g:1164:1: ( ruleINT0 )
            {
            // InternalEcore2XtextTest.g:1164:1: ( ruleINT0 )
            // InternalEcore2XtextTest.g:1165:1: ruleINT0
            {
             before(grammarAccess.getRootAccess().getNameINT0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINT0();

            state._fsp--;

             after(grammarAccess.getRootAccess().getNameINT0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__NameAssignment_2"


    // $ANTLR start "rule__Root__ClassesAssignment_4_2"
    // InternalEcore2XtextTest.g:1174:1: rule__Root__ClassesAssignment_4_2 : ( ruleAbstract ) ;
    public final void rule__Root__ClassesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1178:1: ( ( ruleAbstract ) )
            // InternalEcore2XtextTest.g:1179:1: ( ruleAbstract )
            {
            // InternalEcore2XtextTest.g:1179:1: ( ruleAbstract )
            // InternalEcore2XtextTest.g:1180:1: ruleAbstract
            {
             before(grammarAccess.getRootAccess().getClassesAbstractParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getRootAccess().getClassesAbstractParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ClassesAssignment_4_2"


    // $ANTLR start "rule__Root__ClassesAssignment_4_3_1"
    // InternalEcore2XtextTest.g:1189:1: rule__Root__ClassesAssignment_4_3_1 : ( ruleAbstract ) ;
    public final void rule__Root__ClassesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1193:1: ( ( ruleAbstract ) )
            // InternalEcore2XtextTest.g:1194:1: ( ruleAbstract )
            {
            // InternalEcore2XtextTest.g:1194:1: ( ruleAbstract )
            // InternalEcore2XtextTest.g:1195:1: ruleAbstract
            {
             before(grammarAccess.getRootAccess().getClassesAbstractParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getRootAccess().getClassesAbstractParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ClassesAssignment_4_3_1"


    // $ANTLR start "rule__Root__Concrete0Assignment_5_1"
    // InternalEcore2XtextTest.g:1204:1: rule__Root__Concrete0Assignment_5_1 : ( ruleConcrete0 ) ;
    public final void rule__Root__Concrete0Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1208:1: ( ( ruleConcrete0 ) )
            // InternalEcore2XtextTest.g:1209:1: ( ruleConcrete0 )
            {
            // InternalEcore2XtextTest.g:1209:1: ( ruleConcrete0 )
            // InternalEcore2XtextTest.g:1210:1: ruleConcrete0
            {
             before(grammarAccess.getRootAccess().getConcrete0Concrete0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConcrete0();

            state._fsp--;

             after(grammarAccess.getRootAccess().getConcrete0Concrete0ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Concrete0Assignment_5_1"


    // $ANTLR start "rule__Concrete0_Impl__NameAssignment_2"
    // InternalEcore2XtextTest.g:1219:1: rule__Concrete0_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Concrete0_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1223:1: ( ( ruleEString ) )
            // InternalEcore2XtextTest.g:1224:1: ( ruleEString )
            {
            // InternalEcore2XtextTest.g:1224:1: ( ruleEString )
            // InternalEcore2XtextTest.g:1225:1: ruleEString
            {
             before(grammarAccess.getConcrete0_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConcrete0_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete0_Impl__NameAssignment_2"


    // $ANTLR start "rule__Concrete1_Impl__NameAssignment_2"
    // InternalEcore2XtextTest.g:1234:1: rule__Concrete1_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Concrete1_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1238:1: ( ( ruleEString ) )
            // InternalEcore2XtextTest.g:1239:1: ( ruleEString )
            {
            // InternalEcore2XtextTest.g:1239:1: ( ruleEString )
            // InternalEcore2XtextTest.g:1240:1: ruleEString
            {
             before(grammarAccess.getConcrete1_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConcrete1_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concrete1_Impl__NameAssignment_2"


    // $ANTLR start "rule__DiamondInheritance__NameAssignment_2"
    // InternalEcore2XtextTest.g:1249:1: rule__DiamondInheritance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DiamondInheritance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEcore2XtextTest.g:1253:1: ( ( ruleEString ) )
            // InternalEcore2XtextTest.g:1254:1: ( ruleEString )
            {
            // InternalEcore2XtextTest.g:1254:1: ( ruleEString )
            // InternalEcore2XtextTest.g:1255:1: ruleEString
            {
             before(grammarAccess.getDiamondInheritanceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDiamondInheritanceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiamondInheritance__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000002C000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    }


}