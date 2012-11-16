/*
* generated by Xtext
*/
package com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;

public class SqliteModelParser extends AbstractContentAssistParser {
	
	@Inject
	private SqliteModelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser createParser() {
		com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser result = new com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives_0(), "rule__PrimaryExpression__Alternatives_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives_0_5_3(), "rule__PrimaryExpression__Alternatives_0_5_3");
					put(grammarAccess.getPrimaryExpressionAccess().getIsnullAlternatives_1_0(), "rule__PrimaryExpression__IsnullAlternatives_1_0");
					put(grammarAccess.getPrimaryComparisonOpAccess().getAlternatives(), "rule__PrimaryComparisonOp__Alternatives");
					put(grammarAccess.getSecondaryComparisonOpAccess().getAlternatives(), "rule__SecondaryComparisonOp__Alternatives");
					put(grammarAccess.getStatmentAccess().getAlternatives(), "rule__Statment__Alternatives");
					put(grammarAccess.getAlterTableClauseAccess().getAlternatives(), "rule__AlterTableClause__Alternatives");
					put(grammarAccess.getColumnConstraintAccess().getAlternatives(), "rule__ColumnConstraint__Alternatives");
					put(grammarAccess.getColumnConstraintAccess().getAlternatives_0_3(), "rule__ColumnConstraint__Alternatives_0_3");
					put(grammarAccess.getDefaultValueAccess().getAlternatives(), "rule__DefaultValue__Alternatives");
					put(grammarAccess.getIndexedColumnAccess().getAlternatives_1(), "rule__IndexedColumn__Alternatives_1");
					put(grammarAccess.getOrderingTermAccess().getAlternatives_1(), "rule__OrderingTerm__Alternatives_1");
					put(grammarAccess.getSelectCoreAccess().getAlternatives_1(), "rule__SelectCore__Alternatives_1");
					put(grammarAccess.getSingleSourceAccess().getAlternatives(), "rule__SingleSource__Alternatives");
					put(grammarAccess.getJoinStatementAccess().getAlternatives_2(), "rule__JoinStatement__Alternatives_2");
					put(grammarAccess.getResultColumnAccess().getAlternatives(), "rule__ResultColumn__Alternatives");
					put(grammarAccess.getLiteralValueAccess().getAlternatives(), "rule__LiteralValue__Alternatives");
					put(grammarAccess.getColumnTypeAccess().getAlternatives(), "rule__ColumnType__Alternatives");
					put(grammarAccess.getConflictResolutionAccess().getAlternatives(), "rule__ConflictResolution__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getDatabaseBlockAccess().getGroup(), "rule__DatabaseBlock__Group__0");
					put(grammarAccess.getActionBlockAccess().getGroup(), "rule__ActionBlock__Group__0");
					put(grammarAccess.getActionStatementAccess().getGroup(), "rule__ActionStatement__Group__0");
					put(grammarAccess.getMigrationBlockAccess().getGroup(), "rule__MigrationBlock__Group__0");
					put(grammarAccess.getMigrationBlockAccess().getGroup_3(), "rule__MigrationBlock__Group_3__0");
					put(grammarAccess.getMigrationBlockAccess().getGroup_3_2(), "rule__MigrationBlock__Group_3_2__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getPrimaryComparisonAccess().getGroup(), "rule__PrimaryComparison__Group__0");
					put(grammarAccess.getPrimaryComparisonAccess().getGroup_1(), "rule__PrimaryComparison__Group_1__0");
					put(grammarAccess.getSecondaryComparisonAccess().getGroup(), "rule__SecondaryComparison__Group__0");
					put(grammarAccess.getSecondaryComparisonAccess().getGroup_1(), "rule__SecondaryComparison__Group_1__0");
					put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
					put(grammarAccess.getDivisionAccess().getGroup_1(), "rule__Division__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getSubtractionAccess().getGroup(), "rule__Subtraction__Group__0");
					put(grammarAccess.getSubtractionAccess().getGroup_1(), "rule__Subtraction__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup(), "rule__PrimaryExpression__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_0(), "rule__PrimaryExpression__Group_0_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_1(), "rule__PrimaryExpression__Group_0_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_2(), "rule__PrimaryExpression__Group_0_2__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_3(), "rule__PrimaryExpression__Group_0_3__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_4(), "rule__PrimaryExpression__Group_0_4__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_4_5(), "rule__PrimaryExpression__Group_0_4_5__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_5(), "rule__PrimaryExpression__Group_0_5__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_5_3_1(), "rule__PrimaryExpression__Group_0_5_3_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_5_3_1_1(), "rule__PrimaryExpression__Group_0_5_3_1_1__0");
					put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
					put(grammarAccess.getStatmentAccess().getGroup_0(), "rule__Statment__Group_0__0");
					put(grammarAccess.getStatmentAccess().getGroup_0_6(), "rule__Statment__Group_0_6__0");
					put(grammarAccess.getStatmentAccess().getGroup_0_7(), "rule__Statment__Group_0_7__0");
					put(grammarAccess.getStatmentAccess().getGroup_1(), "rule__Statment__Group_1__0");
					put(grammarAccess.getStatmentAccess().getGroup_2(), "rule__Statment__Group_2__0");
					put(grammarAccess.getAlterTableClauseAccess().getGroup_0(), "rule__AlterTableClause__Group_0__0");
					put(grammarAccess.getAlterTableClauseAccess().getGroup_1(), "rule__AlterTableClause__Group_1__0");
					put(grammarAccess.getColumnDefAccess().getGroup(), "rule__ColumnDef__Group__0");
					put(grammarAccess.getColumnConstraintAccess().getGroup_0(), "rule__ColumnConstraint__Group_0__0");
					put(grammarAccess.getColumnConstraintAccess().getGroup_1(), "rule__ColumnConstraint__Group_1__0");
					put(grammarAccess.getColumnConstraintAccess().getGroup_2(), "rule__ColumnConstraint__Group_2__0");
					put(grammarAccess.getDefaultValueAccess().getGroup_0(), "rule__DefaultValue__Group_0__0");
					put(grammarAccess.getDefaultValueAccess().getGroup_1(), "rule__DefaultValue__Group_1__0");
					put(grammarAccess.getUniqueTableContraintAccess().getGroup(), "rule__UniqueTableContraint__Group__0");
					put(grammarAccess.getUniqueTableContraintAccess().getGroup_3(), "rule__UniqueTableContraint__Group_3__0");
					put(grammarAccess.getIndexedColumnAccess().getGroup(), "rule__IndexedColumn__Group__0");
					put(grammarAccess.getSelectStatementAccess().getGroup(), "rule__SelectStatement__Group__0");
					put(grammarAccess.getSelectStatementAccess().getGroup_1(), "rule__SelectStatement__Group_1__0");
					put(grammarAccess.getSelectStatementAccess().getGroup_1_3(), "rule__SelectStatement__Group_1_3__0");
					put(grammarAccess.getOrderingTermAccess().getGroup(), "rule__OrderingTerm__Group__0");
					put(grammarAccess.getSelectCoreAccess().getGroup(), "rule__SelectCore__Group__0");
					put(grammarAccess.getSelectCoreAccess().getGroup_3(), "rule__SelectCore__Group_3__0");
					put(grammarAccess.getSelectCoreAccess().getGroup_4(), "rule__SelectCore__Group_4__0");
					put(grammarAccess.getSelectCoreAccess().getGroup_5(), "rule__SelectCore__Group_5__0");
					put(grammarAccess.getSelectCoreAccess().getGroup_5_3(), "rule__SelectCore__Group_5_3__0");
					put(grammarAccess.getJoinSourceAccess().getGroup(), "rule__JoinSource__Group__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_0(), "rule__SingleSource__Group_0__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_0_2(), "rule__SingleSource__Group_0_2__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_1(), "rule__SingleSource__Group_1__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_2(), "rule__SingleSource__Group_2__0");
					put(grammarAccess.getJoinStatementAccess().getGroup(), "rule__JoinStatement__Group__0");
					put(grammarAccess.getJoinStatementAccess().getGroup_2_0(), "rule__JoinStatement__Group_2_0__0");
					put(grammarAccess.getResultColumnAccess().getGroup_0(), "rule__ResultColumn__Group_0__0");
					put(grammarAccess.getResultColumnAccess().getGroup_1(), "rule__ResultColumn__Group_1__0");
					put(grammarAccess.getResultColumnAccess().getGroup_2(), "rule__ResultColumn__Group_2__0");
					put(grammarAccess.getResultColumnAccess().getGroup_2_2(), "rule__ResultColumn__Group_2_2__0");
					put(grammarAccess.getConflictClauseAccess().getGroup(), "rule__ConflictClause__Group__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_0(), "rule__LiteralValue__Group_0__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_1(), "rule__LiteralValue__Group_1__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_2(), "rule__LiteralValue__Group_2__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_3(), "rule__LiteralValue__Group_3__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_4(), "rule__LiteralValue__Group_4__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_5(), "rule__LiteralValue__Group_5__0");
					put(grammarAccess.getSignedNumberAccess().getGroup(), "rule__SignedNumber__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getModelAccess().getPackageNameAssignment_1(), "rule__Model__PackageNameAssignment_1");
					put(grammarAccess.getModelAccess().getDatabaseAssignment_2(), "rule__Model__DatabaseAssignment_2");
					put(grammarAccess.getDatabaseBlockAccess().getNameAssignment_1(), "rule__DatabaseBlock__NameAssignment_1");
					put(grammarAccess.getDatabaseBlockAccess().getActionsAssignment_3(), "rule__DatabaseBlock__ActionsAssignment_3");
					put(grammarAccess.getDatabaseBlockAccess().getMigrationsAssignment_4(), "rule__DatabaseBlock__MigrationsAssignment_4");
					put(grammarAccess.getActionBlockAccess().getActionsAssignment_3(), "rule__ActionBlock__ActionsAssignment_3");
					put(grammarAccess.getActionStatementAccess().getNameAssignment_0(), "rule__ActionStatement__NameAssignment_0");
					put(grammarAccess.getActionStatementAccess().getPathAssignment_1(), "rule__ActionStatement__PathAssignment_1");
					put(grammarAccess.getMigrationBlockAccess().getStatementsAssignment_3_0(), "rule__MigrationBlock__StatementsAssignment_3_0");
					put(grammarAccess.getMigrationBlockAccess().getStatementsAssignment_3_2_0(), "rule__MigrationBlock__StatementsAssignment_3_2_0");
					put(grammarAccess.getSqlExpressionAccess().getRootAssignment(), "rule__SqlExpression__RootAssignment");
					put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
					put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
					put(grammarAccess.getPrimaryComparisonAccess().getOpAssignment_1_1(), "rule__PrimaryComparison__OpAssignment_1_1");
					put(grammarAccess.getPrimaryComparisonAccess().getRightAssignment_1_2(), "rule__PrimaryComparison__RightAssignment_1_2");
					put(grammarAccess.getSecondaryComparisonAccess().getOpAssignment_1_1(), "rule__SecondaryComparison__OpAssignment_1_1");
					put(grammarAccess.getSecondaryComparisonAccess().getRightAssignment_1_2(), "rule__SecondaryComparison__RightAssignment_1_2");
					put(grammarAccess.getDivisionAccess().getRightAssignment_1_2(), "rule__Division__RightAssignment_1_2");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
					put(grammarAccess.getSubtractionAccess().getRightAssignment_1_2(), "rule__Subtraction__RightAssignment_1_2");
					put(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_0_0_1(), "rule__PrimaryExpression__NameAssignment_0_0_1");
					put(grammarAccess.getPrimaryExpressionAccess().getLiteralValueAssignment_0_1_1(), "rule__PrimaryExpression__LiteralValueAssignment_0_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getNotAssignment_0_3_1(), "rule__PrimaryExpression__NotAssignment_0_3_1");
					put(grammarAccess.getPrimaryExpressionAccess().getExistsAssignment_0_3_2(), "rule__PrimaryExpression__ExistsAssignment_0_3_2");
					put(grammarAccess.getPrimaryExpressionAccess().getSelectAssignment_0_3_4(), "rule__PrimaryExpression__SelectAssignment_0_3_4");
					put(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAssignment_0_4_2(), "rule__PrimaryExpression__CaseExpressionAssignment_0_4_2");
					put(grammarAccess.getPrimaryExpressionAccess().getCasesAssignment_0_4_3(), "rule__PrimaryExpression__CasesAssignment_0_4_3");
					put(grammarAccess.getPrimaryExpressionAccess().getCasesAssignment_0_4_4(), "rule__PrimaryExpression__CasesAssignment_0_4_4");
					put(grammarAccess.getPrimaryExpressionAccess().getElseExpressionAssignment_0_4_5_1(), "rule__PrimaryExpression__ElseExpressionAssignment_0_4_5_1");
					put(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_0_5_1(), "rule__PrimaryExpression__NameAssignment_0_5_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAllAssignment_0_5_3_0(), "rule__PrimaryExpression__AllAssignment_0_5_3_0");
					put(grammarAccess.getPrimaryExpressionAccess().getArgumentsAssignment_0_5_3_1_0(), "rule__PrimaryExpression__ArgumentsAssignment_0_5_3_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getArugmentsAssignment_0_5_3_1_1_1(), "rule__PrimaryExpression__ArugmentsAssignment_0_5_3_1_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getIsnullAssignment_1(), "rule__PrimaryExpression__IsnullAssignment_1");
					put(grammarAccess.getCaseAccess().getWhenExpressionAssignment_1(), "rule__Case__WhenExpressionAssignment_1");
					put(grammarAccess.getCaseAccess().getThenExpressionAssignment_3(), "rule__Case__ThenExpressionAssignment_3");
					put(grammarAccess.getStatmentAccess().getNameAssignment_0_3(), "rule__Statment__NameAssignment_0_3");
					put(grammarAccess.getStatmentAccess().getColumnDefsAssignment_0_5(), "rule__Statment__ColumnDefsAssignment_0_5");
					put(grammarAccess.getStatmentAccess().getColumnDefsAssignment_0_6_1(), "rule__Statment__ColumnDefsAssignment_0_6_1");
					put(grammarAccess.getStatmentAccess().getConstraintsAssignment_0_7_1(), "rule__Statment__ConstraintsAssignment_0_7_1");
					put(grammarAccess.getStatmentAccess().getNameAssignment_1_3(), "rule__Statment__NameAssignment_1_3");
					put(grammarAccess.getStatmentAccess().getClauseAssignment_1_4(), "rule__Statment__ClauseAssignment_1_4");
					put(grammarAccess.getStatmentAccess().getNameAssignment_2_3(), "rule__Statment__NameAssignment_2_3");
					put(grammarAccess.getStatmentAccess().getSelectStatementAssignment_2_5(), "rule__Statment__SelectStatementAssignment_2_5");
					put(grammarAccess.getTableDeclAccess().getNameAssignment(), "rule__TableDecl__NameAssignment");
					put(grammarAccess.getAlterTableClauseAccess().getNameAssignment_0_2(), "rule__AlterTableClause__NameAssignment_0_2");
					put(grammarAccess.getAlterTableClauseAccess().getColumnDefAssignment_1_2(), "rule__AlterTableClause__ColumnDefAssignment_1_2");
					put(grammarAccess.getColumnDefAccess().getNameAssignment_0(), "rule__ColumnDef__NameAssignment_0");
					put(grammarAccess.getColumnDefAccess().getTypeAssignment_1(), "rule__ColumnDef__TypeAssignment_1");
					put(grammarAccess.getColumnDefAccess().getConstraintsAssignment_2(), "rule__ColumnDef__ConstraintsAssignment_2");
					put(grammarAccess.getColumnConstraintAccess().getAscAssignment_0_3_0(), "rule__ColumnConstraint__AscAssignment_0_3_0");
					put(grammarAccess.getColumnConstraintAccess().getDescAssignment_0_3_1(), "rule__ColumnConstraint__DescAssignment_0_3_1");
					put(grammarAccess.getColumnConstraintAccess().getAutoincrementAssignment_0_4(), "rule__ColumnConstraint__AutoincrementAssignment_0_4");
					put(grammarAccess.getColumnConstraintAccess().getConflictClauseAssignment_1_3(), "rule__ColumnConstraint__ConflictClauseAssignment_1_3");
					put(grammarAccess.getColumnConstraintAccess().getDefaultValueAssignment_2_2(), "rule__ColumnConstraint__DefaultValueAssignment_2_2");
					put(grammarAccess.getDefaultValueAccess().getLiteralAssignment_0_1(), "rule__DefaultValue__LiteralAssignment_0_1");
					put(grammarAccess.getDefaultValueAccess().getExpressionAssignment_1_2(), "rule__DefaultValue__ExpressionAssignment_1_2");
					put(grammarAccess.getUniqueTableContraintAccess().getColumnsAssignment_2(), "rule__UniqueTableContraint__ColumnsAssignment_2");
					put(grammarAccess.getUniqueTableContraintAccess().getColumnsAssignment_3_1(), "rule__UniqueTableContraint__ColumnsAssignment_3_1");
					put(grammarAccess.getUniqueTableContraintAccess().getConflictClauseAssignment_5(), "rule__UniqueTableContraint__ConflictClauseAssignment_5");
					put(grammarAccess.getIndexedColumnAccess().getNameAssignment_0(), "rule__IndexedColumn__NameAssignment_0");
					put(grammarAccess.getIndexedColumnAccess().getAscAssignment_1_0(), "rule__IndexedColumn__AscAssignment_1_0");
					put(grammarAccess.getIndexedColumnAccess().getDescAssignment_1_1(), "rule__IndexedColumn__DescAssignment_1_1");
					put(grammarAccess.getSelectStatementAccess().getCoreAssignment_0(), "rule__SelectStatement__CoreAssignment_0");
					put(grammarAccess.getSelectStatementAccess().getOrderingTermsAssignment_1_2(), "rule__SelectStatement__OrderingTermsAssignment_1_2");
					put(grammarAccess.getSelectStatementAccess().getOrderingTermsAssignment_1_3_1(), "rule__SelectStatement__OrderingTermsAssignment_1_3_1");
					put(grammarAccess.getOrderingTermAccess().getExpressionAssignment_0(), "rule__OrderingTerm__ExpressionAssignment_0");
					put(grammarAccess.getOrderingTermAccess().getAscAssignment_1_0(), "rule__OrderingTerm__AscAssignment_1_0");
					put(grammarAccess.getOrderingTermAccess().getDescAssignment_1_1(), "rule__OrderingTerm__DescAssignment_1_1");
					put(grammarAccess.getSelectCoreAccess().getDistinctAssignment_1_0(), "rule__SelectCore__DistinctAssignment_1_0");
					put(grammarAccess.getSelectCoreAccess().getAllAssignment_1_1(), "rule__SelectCore__AllAssignment_1_1");
					put(grammarAccess.getSelectCoreAccess().getResultColumnsAssignment_2(), "rule__SelectCore__ResultColumnsAssignment_2");
					put(grammarAccess.getSelectCoreAccess().getResultColumnsAssignment_3_1(), "rule__SelectCore__ResultColumnsAssignment_3_1");
					put(grammarAccess.getSelectCoreAccess().getSourceAssignment_4_1(), "rule__SelectCore__SourceAssignment_4_1");
					put(grammarAccess.getSelectCoreAccess().getGroupByExpressionsAssignment_5_2(), "rule__SelectCore__GroupByExpressionsAssignment_5_2");
					put(grammarAccess.getSelectCoreAccess().getGroupByExpressionsAssignment_5_3_1(), "rule__SelectCore__GroupByExpressionsAssignment_5_3_1");
					put(grammarAccess.getJoinSourceAccess().getSourceAssignment_0(), "rule__JoinSource__SourceAssignment_0");
					put(grammarAccess.getJoinSourceAccess().getJoinStatementsAssignment_1(), "rule__JoinSource__JoinStatementsAssignment_1");
					put(grammarAccess.getSingleSourceAccess().getTableNameAssignment_0_1(), "rule__SingleSource__TableNameAssignment_0_1");
					put(grammarAccess.getSingleSourceAccess().getNameAssignment_0_2_1(), "rule__SingleSource__NameAssignment_0_2_1");
					put(grammarAccess.getSingleSourceAccess().getSelectStatementAssignment_1_2(), "rule__SingleSource__SelectStatementAssignment_1_2");
					put(grammarAccess.getSingleSourceAccess().getJoinSourceAssignment_2_2(), "rule__SingleSource__JoinSourceAssignment_2_2");
					put(grammarAccess.getJoinStatementAccess().getNaturalAssignment_1(), "rule__JoinStatement__NaturalAssignment_1");
					put(grammarAccess.getJoinStatementAccess().getLeftAssignment_2_0_0(), "rule__JoinStatement__LeftAssignment_2_0_0");
					put(grammarAccess.getJoinStatementAccess().getOuterAssignment_2_0_1(), "rule__JoinStatement__OuterAssignment_2_0_1");
					put(grammarAccess.getJoinStatementAccess().getInnerAssignment_2_1(), "rule__JoinStatement__InnerAssignment_2_1");
					put(grammarAccess.getJoinStatementAccess().getCrossAssignment_2_2(), "rule__JoinStatement__CrossAssignment_2_2");
					put(grammarAccess.getJoinStatementAccess().getSingleSourceAssignment_4(), "rule__JoinStatement__SingleSourceAssignment_4");
					put(grammarAccess.getJoinStatementAccess().getExpressionAssignment_6(), "rule__JoinStatement__ExpressionAssignment_6");
					put(grammarAccess.getResultColumnAccess().getTableRefAssignment_1_1(), "rule__ResultColumn__TableRefAssignment_1_1");
					put(grammarAccess.getResultColumnAccess().getExpressionAssignment_2_1(), "rule__ResultColumn__ExpressionAssignment_2_1");
					put(grammarAccess.getResultColumnAccess().getNameAssignment_2_2_1(), "rule__ResultColumn__NameAssignment_2_2_1");
					put(grammarAccess.getConflictClauseAccess().getResolutionAssignment_2(), "rule__ConflictClause__ResolutionAssignment_2");
					put(grammarAccess.getLiteralValueAccess().getNumberAssignment_0_1(), "rule__LiteralValue__NumberAssignment_0_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_1_1(), "rule__LiteralValue__LiteralAssignment_1_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_2_1(), "rule__LiteralValue__LiteralAssignment_2_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_3_1(), "rule__LiteralValue__LiteralAssignment_3_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_4_1(), "rule__LiteralValue__LiteralAssignment_4_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_5_1(), "rule__LiteralValue__LiteralAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser typedParser = (com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SqliteModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SqliteModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
