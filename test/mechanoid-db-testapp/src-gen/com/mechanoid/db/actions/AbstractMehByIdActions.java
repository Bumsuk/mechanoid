/*
 * Generated by Robotoworks Mechanoid
 */
package com.mechanoid.db.actions;

import android.content.ContentValues;
import android.content.ContentProvider;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.robotoworks.mechanoid.sqlite.ContentProviderActions;
import com.robotoworks.mechanoid.sqlite.SelectionQueryBuilder;
import com.robotoworks.mechanoid.sqlite.MechanoidContentProvider;
import static com.robotoworks.mechanoid.sqlite.SelectionQueryBuilder.Op.*;

import com.mechanoid.db.AbstractTestDBOpenHelper.Tables;
import com.mechanoid.db.TestDBContract.Meh;
			
public abstract class AbstractMehByIdActions extends ContentProviderActions {
	@Override
	public int delete(MechanoidContentProvider provider, Uri uri, String selection, String[] selectionArgs){
		return -1;
	}
	
	@Override
	public Uri insert(MechanoidContentProvider provider, Uri uri, ContentValues values){
		return null;
	}
	
	@Override
	public int update(MechanoidContentProvider provider, Uri uri, ContentValues values, String selection, String[] selectionArgs){
		return -1;
	}

	@Override
	public Cursor query(MechanoidContentProvider provider, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder){
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
			
		return new SelectionQueryBuilder()
		.expr(Meh._ID, EQ, uri.getPathSegments().get(1))
		.append(selection, selectionArgs)
		.query(db, Tables.MEH, projection, sortOrder);
	}
}
