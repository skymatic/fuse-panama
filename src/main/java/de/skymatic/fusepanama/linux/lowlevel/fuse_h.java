// Generated by jextract

package de.skymatic.fusepanama.linux.lowlevel;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class fuse_h  {

    static {
        // TODO: there must be a better way to load libfuse.so...
        System.load("/lib/x86_64-linux-gnu/libfuse.so.2.9.9");
    }

    static final SymbolLookup LIBRARIES = RuntimeHelper.lookup();    /* package-private */ fuse_h() {}
    public static MethodHandle fuse_exit$MH() {
        return RuntimeHelper.requireNonNull(constants$0.fuse_exit$MH,"fuse_exit");
    }
    public static void fuse_exit ( Addressable f) {
        var mh$ = RuntimeHelper.requireNonNull(constants$0.fuse_exit$MH, "fuse_exit");
        try {
            mh$.invokeExact(f.address());
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle fuse_get_context$MH() {
        return RuntimeHelper.requireNonNull(constants$0.fuse_get_context$MH,"fuse_get_context");
    }
    public static MemoryAddress fuse_get_context () {
        var mh$ = RuntimeHelper.requireNonNull(constants$0.fuse_get_context$MH, "fuse_get_context");
        try {
            return (jdk.incubator.foreign.MemoryAddress)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle fuse_main_real$MH() {
        return RuntimeHelper.requireNonNull(constants$0.fuse_main_real$MH,"fuse_main_real");
    }
    public static int fuse_main_real ( int argc,  Addressable argv,  Addressable op,  long op_size,  Addressable user_data) {
        var mh$ = RuntimeHelper.requireNonNull(constants$0.fuse_main_real$MH, "fuse_main_real");
        try {
            return (int)mh$.invokeExact(argc, argv.address(), op.address(), op_size, user_data.address());
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


