package com.tela.notification_assets

import androidx.annotation.NonNull
import io.flutter.embedding.engine.plugins.FlutterPlugin

class TelaNotificationAssetsPlugin: FlutterPlugin {
    override fun onAttachedToEngine(@NonNull flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        // No-op. This plugin only provides Android drawable resources.
    }

    override fun onDetachedFromEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
        // No-op.
    }
}
