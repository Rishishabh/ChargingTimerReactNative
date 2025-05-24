import React, { useEffect, useState } from 'react';
import { View, Text, StyleSheet } from 'react-native';
import DeviceInfo from 'react-native-device-info';

const App = () => {
  const [isCharging, setIsCharging] = useState(false);

  useEffect(() => {
    const interval = setInterval(async () => {
      const state = await DeviceInfo.getPowerState();
      setIsCharging(state.batteryState === 'charging');
    }, 2000);
    return () => clearInterval(interval);
  }, []);

  return (
    <View style={styles.container}>
      <Text style={styles.text}>{isCharging ? 'Charging...' : 'Not Charging'}</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', alignItems: 'center' },
  text: { fontSize: 24 }
});

export default App;
